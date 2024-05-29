package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.data.MovieRepositoryImpl
import com.novatech.novamovies.data.datasource.MovieCacheDataSource
import com.novatech.novamovies.data.datasource.MovieLocalDataSource
import com.novatech.novamovies.data.datasource.MovieRemoteDataSource
import com.novatech.novamovies.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(movieRemoteDataSource: MovieRemoteDataSource,
                               movieLocalDataSource: MovieLocalDataSource,
                               movieCacheDataSource: MovieCacheDataSource) : MovieRepository{

        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource, movieCacheDataSource)
    }
}