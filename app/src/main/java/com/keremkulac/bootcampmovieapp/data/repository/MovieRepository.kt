package com.keremkulac.bootcampmovieapp.data.repository

import com.keremkulac.bootcampmovieapp.data.dataSource.MovieDataSource
import com.keremkulac.bootcampmovieapp.data.entity.Movie

class MovieRepository (val movieDataSource: MovieDataSource){
    suspend fun loadMovies() : List<Movie> = movieDataSource.loadMovies()

}