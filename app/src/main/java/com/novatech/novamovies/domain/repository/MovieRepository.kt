package com.novatech.novamovies.domain.repository

import com.novatech.novamovies.data.model.Movie

interface MovieRepository {

    suspend fun getMovies() : List<Movie>?
    suspend fun updateMovies() : List<Movie>?
}