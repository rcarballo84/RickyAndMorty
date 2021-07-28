package com.rcarballo.rickandmortyapp.ui

import androidx.appcompat.app.AppCompatActivity

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rcarballo.rickandmortyapp.ui.ItemDetailFragment
import com.rcarballo.rickandmortyapp.ListViewModel
import com.rcarballo.rickandmortyapp.R
import com.rcarballo.rickandmortyapp.RickAndMortyAdapter
import com.rcarballo.rickandmortyapp.placeholder.PlaceholderContent;
import com.rcarballo.rickandmortyapp.databinding.FragmentItemListBinding
import com.rcarballo.rickandmortyapp.databinding.ItemListContentBinding

/**
 * A Fragment representing a list of Pings. This fragment
 * has different presentations for handset and larger screen devices. On
 * handsets, the fragment presents a list of items, which when touched,
 * lead to a {@link ItemDetailFragment} representing
 * item details. On larger screens, the Navigation controller presents the list of items and
 * item details side-by-side using two vertical panes.
 */

class ItemListFragment : Fragment() {
    private lateinit var scrollListener: RecyclerView.OnScrollListener
    private var lastVisibleItemPosition: Int = 0
    private var page: Int = 1

    private var _binding: FragmentItemListBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    private val viewModel: ListViewModel by lazy {
        ViewModelProvider(this).get(ListViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemListBinding.inflate(inflater, container, false)
        initUI()
        return binding.root

    }

    private fun initUI() {
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.itemList.adapter = RickAndMortyAdapter(RickAndMortyAdapter.OnClickListener {
            viewModel.displayPropertyDetails(it)
        })

        Glide.with( binding.loadingImage.context)
            .load(R.drawable.rick_nad_morty_background)
            .into(binding.loadingImage)

        viewModel.navigateToSelectedProperty.observe(viewLifecycleOwner, Observer {
            if (null != it) {
                this.findNavController().navigate(ItemListFragmentDirections.showItemDetail(it))
                viewModel.displayPropertyDetailsComplete()
            }

        })

        viewModel.loadPage.observe(viewLifecycleOwner, Observer { loadPage ->
            if (loadPage) {
                setRecyclerViewScrollListener()
            }
        })

        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.app_name)
    }

    private fun setRecyclerViewScrollListener() {
        scrollListener = object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView!!, newState)
                val totalItemCount = recyclerView!!.layoutManager!!.itemCount
                lastVisibleItemPosition = (binding.itemList.layoutManager as LinearLayoutManager).findLastVisibleItemPosition()
                if (totalItemCount == lastVisibleItemPosition + 1) {
                    page += 1
                    viewModel.updatePage(page)
                    binding.itemList.removeOnScrollListener(scrollListener)
                }
            }
        }
        binding.itemList.addOnScrollListener(scrollListener)
    }
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //ViewCompat.addOnUnhandledKeyEventListener(view, unhandledKeyEventListenerCompat)

        val recyclerView: RecyclerView = binding.itemList

        // Leaving this not using view binding as it relies on if the view is visible the current
        // layout configuration (layout, layout-sw600dp)
        val itemDetailFragmentContainer: View? = view.findViewById(R.id.item_detail_nav_container)

        /** Click Listener to trigger navigation based on if you have
         * a single pane layout or two pane layout
         */
        val onClickListener = View.OnClickListener { itemView ->
            val item = itemView.tag as PlaceholderContent.PlaceholderItem
            val bundle = Bundle()
            bundle.putString(
                ItemDetailFragment.ARG_ITEM_ID,
                    item.id
            )
            if (itemDetailFragmentContainer != null) {
                itemDetailFragmentContainer.findNavController()
                        .navigate(R.id.item_detail_fragment, bundle)
            } else {
                itemView.findNavController().navigate(R.id.show_item_detail, bundle)
            }
        }

        /**
         * Context click listener to handle Right click events
         * from mice and trackpad input to provide a more native
         * experience on larger screen devices
         */
        val onContextClickListener = View.OnContextClickListener { v ->
            val item = v.tag as PlaceholderContent.PlaceholderItem
            Toast.makeText(
                    v.context,
                    "Context click of item " + item.id,
                    Toast.LENGTH_LONG
            ).show()
            true
        }
        setupRecyclerView(recyclerView, onClickListener, onContextClickListener)
    }

    private fun setupRecyclerView(
            recyclerView: RecyclerView,
            onClickListener: View.OnClickListener,
            onContextClickListener: View.OnContextClickListener
    ) {

        recyclerView.adapter = SimpleItemRecyclerViewAdapter(
                PlaceholderContent.ITEMS,
                onClickListener,
                onContextClickListener
        )
    }

    class SimpleItemRecyclerViewAdapter(
            private val values: List<PlaceholderContent.PlaceholderItem>,
            private val onClickListener: View.OnClickListener,
            private val onContextClickListener: View.OnContextClickListener
    ) :
            RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            val binding = ItemListContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)

        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = values[position]
            holder.idView.text = item.id
            holder.contentView.text = item.content

            with(holder.itemView) {
                tag = item
                setOnClickListener(onClickListener)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    setOnContextClickListener(onContextClickListener)
                }
            }
        }

        override fun getItemCount() = values.size

        inner class ViewHolder(binding: ItemListContentBinding) : RecyclerView.ViewHolder(binding.root) {
            val idView: TextView = binding.nameTextView
            val contentView: TextView = binding.statusTextView
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }*/
}