package com.rcarballo.rickandmortyapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rcarballo.rickandmortyapp.Personaje

class DetailViewModel (@Suppress("UNUSED_PARAMETER")personaje: Personaje, app: Application) : AndroidViewModel(app){
    private val _selectedItem = MutableLiveData<Personaje>()
    val selectedItem: LiveData<Personaje>
        get() = _selectedItem

    init {
        _selectedItem.value = personaje
    }
}