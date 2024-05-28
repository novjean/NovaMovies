package com.novatech.novamovies.data.datasouceImpl

import com.novatech.novamovies.data.datasource.MovieCacheDataSource
import com.novatech.novamovies.data.model.Movie

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}