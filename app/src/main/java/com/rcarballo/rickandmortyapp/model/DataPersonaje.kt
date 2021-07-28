package com.rcarballo.rickandmortyapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class DataPersonaje(
    val info: @RawValue InfoPagination,
    val results: ArrayList<Personaje>
) : Parcelable