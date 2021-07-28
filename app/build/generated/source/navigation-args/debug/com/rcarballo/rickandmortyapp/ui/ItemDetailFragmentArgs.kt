package com.rcarballo.rickandmortyapp.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.rcarballo.rickandmortyapp.Personaje
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class ItemDetailFragmentArgs(
  val selectedItem: Personaje
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ItemDetailFragmentArgs {
      bundle.setClassLoader(ItemDetailFragmentArgs::class.java.classLoader)
      val __selectedItem : Personaje?
      if (bundle.containsKey("selectedItem")) {
        if (Parcelable::class.java.isAssignableFrom(Personaje::class.java) ||
            Serializable::class.java.isAssignableFrom(Personaje::class.java)) {
          __selectedItem = bundle.get("selectedItem") as Personaje?
        } else {
          throw UnsupportedOperationException(Personaje::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__selectedItem == null) {
          throw IllegalArgumentException("Argument \"selectedItem\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedItem\" is missing and does not have an android:defaultValue")
      }
      return ItemDetailFragmentArgs(__selectedItem)
    }
  }
}
