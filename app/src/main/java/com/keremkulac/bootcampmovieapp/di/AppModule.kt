package com.keremkulac.bootcampmovieapp.di

import android.content.Context
import androidx.room.Room
import com.keremkulac.bootcampmovieapp.data.dataSource.MovieDataSource
import com.keremkulac.bootcampmovieapp.data.repository.MovieRepository
import com.keremkulac.bootcampmovieapp.room.MoviesDao
import com.keremkulac.bootcampmovieapp.room.MoviesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule  {
    @Provides
    @Singleton
    fun provideMoviesDao(@ApplicationContext context: Context) : MoviesDao{
        val moviesDatabase = Room.databaseBuilder(context,MoviesDatabase::class.java,"movies.sqlite")
            .createFromAsset("movies.sqlite").build()
        return moviesDatabase.getMoviesDao()
    }

    @Provides
    @Singleton
    fun provideMovieDataSource(moviesDao: MoviesDao) : MovieDataSource{
        return MovieDataSource(moviesDao)
    }
    @Provides
    @Singleton
    fun provideMovieRepository(movieDataSource: MovieDataSource) : MovieRepository{
        return MovieRepository(movieDataSource)
    }
}