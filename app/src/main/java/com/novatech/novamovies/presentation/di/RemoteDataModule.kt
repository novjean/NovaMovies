package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.data.api.TmdbService
import com.novatech.novamovies.data.datasouceImpl.MovieRemoteDataSourceImpl
import com.novatech.novamovies.data.datasource.MovieRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String){

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TmdbService): MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }
}