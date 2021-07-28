package com.rcarballo.rickandmortyapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rcarballo.rickandmortyapp.databinding.ItemListContentBinding

/**
 * Created by @kulnois on 29/08/2020.
 */

class RickAndMortyAdapter (private val onClickListener: OnClickListener): ListAdapter<Personaje, RickAndMortyAdapter.RickAndMortyViewHolder>(DiffCallback) {
    class RickAndMortyViewHolder(private var binding: ItemListContentBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(rickAndMorty: Personaje) {
            binding.property = rickAndMorty
            binding.executePendingBindings()
        }
    }

    override fun submitList(list: MutableList<Personaje>?) {
        super.submitList(list?.let { ArrayList(it) })
    }

    companion object DiffCallback: DiffUtil.ItemCallback<Personaje>() {
        override fun areItemsTheSame(oldItem: Personaje, newItem: Personaje): Boolean {
            return  oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Personaje, newItem: Personaje): Boolean {
            return  oldItem.id == newItem.id
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RickAndMortyAdapter.RickAndMortyViewHolder {
        return RickAndMortyViewHolder(ItemListContentBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: RickAndMortyAdapter.RickAndMortyViewHolder, position: Int) {
        val rickAndMorty = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(rickAndMorty)
        }
        holder.bind(rickAndMorty)
    }

    class OnClickListener (val clickListener: (rickAndMorty:Personaje) -> Unit) {
        fun onClick(rickAndMorty: Personaje) = clickListener(rickAndMorty)
    }

}