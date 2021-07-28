package com.rcarballo.rickandmortyapp.ui

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rcarballo.rickandmortyapp.placeholder.PlaceholderContent
import com.rcarballo.rickandmortyapp.databinding.FragmentItemDetailBinding

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListFragment]
 * in two-pane mode (on larger screen devices) or self-contained
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The placeholder content this fragment is presenting.
     */
    //private var item: PlaceholderContent.PlaceholderItem? = null

    lateinit var itemDetailTextView: TextView

    private var _binding: FragmentItemDetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var application: Application

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the placeholder content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
                item = PlaceholderContent.ITEM_MAP[it.getString(ARG_ITEM_ID)]
            }
        }
    }*/

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        @Suppress("UNUSED_VARIABLE")
        application = requireNotNull(activity).application

        _binding = FragmentItemDetailBinding.inflate(inflater, container, false)
        initUI()
        val rootView = binding.root

        //binding.toolbarLayout?.title = item?.content
/*
        itemDetailTextView = binding.nameTextView
        // Show the placeholder content as text in a TextView.
        item?.let {
            itemDetailTextView.text = it.details
        }*/

        return rootView
    }

    private fun initUI() {
        binding.lifecycleOwner = this

        val rickAndMortyItem = ItemDetailFragmentArgs.fromBundle(requireArguments()).selectedItem

        (activity as AppCompatActivity).supportActionBar?.title = rickAndMortyItem.name

        val viewModelFactory = DetailViewModelFactory(rickAndMortyItem, application)

        binding.viewModel = ViewModelProvider(this, viewModelFactory).get(DetailViewModel::class.java)
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}