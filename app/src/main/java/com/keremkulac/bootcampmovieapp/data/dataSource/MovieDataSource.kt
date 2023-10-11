package com.keremkulac.bootcampmovieapp.data.dataSource

import com.keremkulac.bootcampmovieapp.data.entity.Movie
import com.keremkulac.bootcampmovieapp.room.MoviesDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieDataSource(val moviesDao: MoviesDao) {

    suspend fun loadMovies() : List<Movie> =
        withContext(Dispatchers.IO){
            return@withContext moviesDao.loadMovies()
        }
}