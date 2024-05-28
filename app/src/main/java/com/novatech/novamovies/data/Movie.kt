package com.novatech.novamovies.data

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_movies")
data class Movie(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title:String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath:String,
    @SerializedName("release_date")
    val releaseDate:String
)
