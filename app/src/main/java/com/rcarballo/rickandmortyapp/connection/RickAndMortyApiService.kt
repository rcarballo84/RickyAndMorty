package com.rcarballo.rickandmortyapp.connection

import com.rcarballo.rickandmortyapp.DataPersonaje
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val URL_API = "https://rickandmortyapi.com/api/";

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(URL_API)
    .build()

public interface RickAndMortyApiService {
    @GET("character/")
    suspend fun getData(@Query("page") type: Int):
            Response<DataPersonaje>
}

object RickAndMortyApi {
    val retrofitService : RickAndMortyApiService by lazy {
        retrofit.create(RickAndMortyApiService::class.java)
    }
}