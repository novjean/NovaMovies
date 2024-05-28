package com.novatech.novamovies.domain.usecases

import com.novatech.novamovies.domain.repository.MovieRepository
import com.novatech.novamovies.data.model.Movie

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute() : List<Movie>? = movieRepository.getMovies()
}