package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.domain.repository.MovieRepository
import com.novatech.novamovies.domain.usecases.GetMoviesUseCase
import com.novatech.novamovies.domain.usecases.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase{
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase{
        return UpdateMoviesUseCase(movieRepository)
    }
}