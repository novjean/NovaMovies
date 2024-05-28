package com.novatech.novamovies.data.domain.usecases

import com.novatech.novamovies.data.domain.repository.MovieRepository
import com.novatech.novamovies.data.model.Movie

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute() : List<Movie>? = movieRepository.updateMovies()
}