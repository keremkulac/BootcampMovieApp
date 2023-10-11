package com.keremkulac.bootcampmovieapp.room

import androidx.room.Dao
import androidx.room.Query
import com.keremkulac.bootcampmovieapp.data.entity.Movie

@Dao
interface MoviesDao {
    @Query("SELECT * FROM movies")
    suspend fun loadMovies() : List<Movie>
}