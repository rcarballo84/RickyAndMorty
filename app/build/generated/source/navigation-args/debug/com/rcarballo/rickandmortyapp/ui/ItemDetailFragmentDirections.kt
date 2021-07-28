package com.rcarballo.rickandmortyapp.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.rcarballo.rickandmortyapp.R

class ItemDetailFragmentDirections private constructor() {
  companion object {
    fun actionDetailFragmentToListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailFragment_to_listFragment)
  }
}
