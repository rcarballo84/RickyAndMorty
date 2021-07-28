package com.rcarballo.rickandmortyapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data (
    val name: String,
    val url: String
) : Parcelable