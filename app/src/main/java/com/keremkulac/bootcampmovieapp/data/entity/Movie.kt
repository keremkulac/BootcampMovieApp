package com.keremkulac.bootcampmovieapp.data.entity

data class Movie(
    var id : Int,
    var movieName : String,
    var movieImage : String,
    var moviePrice : Int
) : java.io.Serializable
