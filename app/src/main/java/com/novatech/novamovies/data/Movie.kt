package com.novatech.novamovies.data

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val movieId: Int,
    @SerializedName("title")
    val title:String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath:String,
    @SerializedName("release_date")
    val releaseDate:String
)
