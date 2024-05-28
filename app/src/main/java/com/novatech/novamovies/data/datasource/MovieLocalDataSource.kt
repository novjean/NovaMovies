package com.novatech.novamovies.data.datasource

import com.novatech.novamovies.data.model.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDb() : List<Movie>

    suspend fun saveMoviesToDb(movies: List<Movie>)

    suspend fun clearAll()

}