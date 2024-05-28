package com.novatech.novamovies.data.domain

import com.novatech.novamovies.data.model.Movie

interface MovieRepository {

    suspend fun getMovies() : List<Movie>?
    suspend fun updateMovies() : List<Movie>?
}