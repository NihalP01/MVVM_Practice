package com.techmess.viveoclone.network

import com.techmess.viveoclone.data.Movie
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiClient {
    @GET("movielist.json")
    suspend fun getMovies(): Response<List<Movie>>

    object ApiAdapter{
        val apiClient: ApiClient = Retrofit.Builder()
            .baseUrl("https://howtodoandroid.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
            .build()
            .create(ApiClient::class.java)
    }
}