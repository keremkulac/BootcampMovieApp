package com.keremkulac.bootcampmovieapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.keremkulac.bootcampmovieapp.data.entity.Movie

@Database(entities = [Movie::class], version = 1)
abstract class MoviesDatabase : RoomDatabase() {
    abstract fun getMoviesDao() : MoviesDao
}