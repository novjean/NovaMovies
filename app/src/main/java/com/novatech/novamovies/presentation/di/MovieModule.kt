package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.domain.usecases.GetMoviesUseCase
import com.novatech.novamovies.domain.usecases.UpdateMoviesUseCase
import com.novatech.novamovies.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ) : ViewModelFactory {
        return ViewModelFactory(
            getMoviesUseCase, updateMoviesUseCase
        )
    }
}