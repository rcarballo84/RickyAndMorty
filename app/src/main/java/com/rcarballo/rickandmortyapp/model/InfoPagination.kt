package com.rcarballo.rickandmortyapp

data class InfoPagination(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)