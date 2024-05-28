package com.novatech.novamovies.data.datasouceImpl

import com.novatech.novamovies.data.api.TmdbService
import com.novatech.novamovies.data.datasource.MovieRemoteDataSource
import com.novatech.novamovies.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TmdbService,
    private val apiKey: String
) : MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}