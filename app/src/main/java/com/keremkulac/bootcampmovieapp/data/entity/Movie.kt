package com.keremkulac.bootcampmovieapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") @NotNull val id: Int,
    @ColumnInfo(name = "movie_name") @NotNull var movieName : String,
    @ColumnInfo(name = "movie_image") @NotNull var movieImage : String,
    @ColumnInfo(name = "movie_price") @NotNull var moviePrice : Int
) : java.io.Serializable
