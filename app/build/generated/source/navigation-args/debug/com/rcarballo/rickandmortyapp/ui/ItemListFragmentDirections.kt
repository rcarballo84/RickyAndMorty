package com.rcarballo.rickandmortyapp.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.rcarballo.rickandmortyapp.Personaje
import com.rcarballo.rickandmortyapp.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class ItemListFragmentDirections private constructor() {
  private data class ShowItemDetail(
    val selectedItem: Personaje
  ) : NavDirections {
    override fun getActionId(): Int = R.id.show_item_detail

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Personaje::class.java)) {
        result.putParcelable("selectedItem", this.selectedItem as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Personaje::class.java)) {
        result.putSerializable("selectedItem", this.selectedItem as Serializable)
      } else {
        throw UnsupportedOperationException(Personaje::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun showItemDetail(selectedItem: Personaje): NavDirections = ShowItemDetail(selectedItem)
  }
}
