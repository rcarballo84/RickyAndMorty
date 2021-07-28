package com.rcarballo.rickandmortyapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
class Personaje (
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: @RawValue Data,
    val location: @RawValue Data,
    val image: String,
    val episode: ArrayList<String>
) : Parcelable