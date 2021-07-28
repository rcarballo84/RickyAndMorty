package com.rcarballo.rickandmortyapp.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rcarballo.rickandmortyapp.Personaje

class DetailViewModelFactory(
    private val personaje: Personaje,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(personaje, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}