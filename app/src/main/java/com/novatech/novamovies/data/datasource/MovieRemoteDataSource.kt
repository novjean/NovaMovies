package com.novatech.novamovies.data.datasource

import com.novatech.novamovies.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies() : Response<MovieList>
}