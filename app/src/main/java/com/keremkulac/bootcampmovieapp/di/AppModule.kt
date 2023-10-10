package com.keremkulac.bootcampmovieapp.di

import com.keremkulac.bootcampmovieapp.data.dataSource.MovieDataSource
import com.keremkulac.bootcampmovieapp.data.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule  {
    @Provides
    @Singleton
    fun provideMovieDataSource() : MovieDataSource{
        return MovieDataSource()
    }

    @Provides
    @Singleton
    fun provideMovieRepository(movieDataSource: MovieDataSource) : MovieRepository{
        return MovieRepository(movieDataSource)
    }
}