package com.keremkulac.bootcampmovieapp.data.dataSource

import com.keremkulac.bootcampmovieapp.data.entity.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieDataSource {

    suspend fun loadMovies() : List<Movie> =
        withContext(Dispatchers.IO){
            var list = ArrayList<Movie>()
            val movie1 = Movie(0,"Django","django",24)
            val movie2 = Movie(1,"Inception","inception",32)
            val movie3 = Movie(2,"Interstellar","interstellar",16)
            val movie4 = Movie(3,"Anadoluda","anadoluda",52)
            val movie5 = Movie(4,"The Pianist","thepianist",44)
            val movie6 = Movie(5,"The Hateful Eight","thehatefuleight",38)
            list.add(movie1)
            list.add(movie2)
            list.add(movie3)
            list.add(movie4)
            list.add(movie5)
            list.add(movie6)
            return@withContext list
        }
}