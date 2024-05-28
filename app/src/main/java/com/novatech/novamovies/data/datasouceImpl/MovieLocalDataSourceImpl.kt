package com.novatech.novamovies.data.datasouceImpl

import com.novatech.novamovies.data.datasource.MovieLocalDataSource
import com.novatech.novamovies.data.db.MovieDao
import com.novatech.novamovies.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(
    private val movieDao: MovieDao
) : MovieLocalDataSource {

    override suspend fun getMoviesFromDb(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDb(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}