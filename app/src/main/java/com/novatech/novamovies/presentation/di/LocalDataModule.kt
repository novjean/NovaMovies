package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.data.datasouceImpl.MovieLocalDataSourceImpl
import com.novatech.novamovies.data.datasource.MovieLocalDataSource
import com.novatech.novamovies.data.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }
}