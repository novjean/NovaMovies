package com.novatech.novamovies.data.api

import com.novatech.novamovies.data.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey : String
    ) : Response<MovieList>

}