package com.techmess.viveoclone.network.repository

import com.techmess.viveoclone.network.ApiClient


class Repository(private val retrofitService: ApiClient) {
    suspend fun getMovies() = retrofitService.getMovies()
}