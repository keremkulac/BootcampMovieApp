package com.keremkulac.bootcampmovieapp.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.keremkulac.bootcampmovieapp.data.entity.Movie
import com.keremkulac.bootcampmovieapp.data.repository.MovieRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel(){
    private val movieRepository = MovieRepository()
    val moviesList = MutableLiveData<List<Movie>>()
    init {
        loadMovies()
    }

   private fun loadMovies(){
        CoroutineScope(Dispatchers.Main).launch {
            moviesList.value = movieRepository.loadMovies()
        }
    }
}