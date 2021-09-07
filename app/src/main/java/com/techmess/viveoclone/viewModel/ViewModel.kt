package com.techmess.viveoclone.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techmess.viveoclone.data.Movie
import com.techmess.viveoclone.network.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class ViewModel(private val respository: Repository) : ViewModel() {

    private val _movieList = MutableLiveData<List<Movie>>()
    private val movieList: LiveData<List<Movie>> = _movieList

    fun getMovies() {
        viewModelScope.launch(Dispatchers.Main) {
            try {
                val response = respository.getMovies()
                if (response.isSuccessful && response.body() != null) {
                    _movieList.postValue(response.body()!!)
                } else {

                }
            } catch (e: Exception) {

            }
        }
    }
}