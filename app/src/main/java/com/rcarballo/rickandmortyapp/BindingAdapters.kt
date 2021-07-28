package com.rcarballo.rickandmortyapp

import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import androidx.core.widget.ContentLoadingProgressBar
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rcarballo.rickandmortyapp.util.ItemStatus
import com.rcarballo.rickandmortyapp.util.RickAndMortyStatus

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: ArrayList<Personaje>?) {
    val adapter = recyclerView.adapter as RickAndMortyAdapter
    adapter.submitList(data)
}

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = it.toUri().buildUpon().scheme("https").build()
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.image_background))
                   // .error(R.drawable.ic_broken_image))
            .into(imgView)

    }
}

@BindingAdapter("status")
fun bindName(imgView: ImageView, status: String?){
    when (status) {
        ItemStatus.ALIVE.value -> {
            imgView.setColorFilter(ContextCompat.getColor(imgView.context, R.color.alive))
        }
        ItemStatus.DEAD.value -> {
            imgView.setColorFilter(ContextCompat.getColor(imgView.context, R.color.dead))
        }
        ItemStatus.UNKNOWN.value -> {
            imgView.setColorFilter(ContextCompat.getColor(imgView.context, R.color.unknown))
        }
    }
}

@BindingAdapter("rickAndMortyApiStatus")
fun bindStatus(statusImageView: ImageView, status: RickAndMortyStatus?) {
    when (status) {
        RickAndMortyStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
        }
        RickAndMortyStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            //statusImageView.setImageResource(R.drawable.ic_broken_image)
        }
        RickAndMortyStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}

@BindingAdapter("relativeLayoutStatus")
fun bindRelativeLayoutStatus(relativeLayout: RelativeLayout, status: String?) {
    when (status) {
        ItemStatus.ALIVE.value -> {
            relativeLayout.setBackgroundResource(R.drawable.circular_bordershape_alive)
        }
        ItemStatus.DEAD.value -> {
            relativeLayout.setBackgroundResource(R.drawable.circular_bordershape_dead)
        }
        ItemStatus.UNKNOWN.value -> {
            relativeLayout.setBackgroundResource(R.drawable.circular_bordershape_unknown)
        }
    }
}

@BindingAdapter("rickAndMortyApiStatusProgress")
fun bindStatusProgress(contentLoadingProgressBar: ContentLoadingProgressBar, status: RickAndMortyStatus?) {
    when (status) {
        RickAndMortyStatus.LOADING -> {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                contentLoadingProgressBar.tooltipText = "Loading...."
            }
            contentLoadingProgressBar.visibility = View.VISIBLE
        }
        RickAndMortyStatus.ERROR -> {
            contentLoadingProgressBar.visibility = View.VISIBLE
        }
        RickAndMortyStatus.DONE -> {
            contentLoadingProgressBar.visibility = View.GONE
        }
    }
}