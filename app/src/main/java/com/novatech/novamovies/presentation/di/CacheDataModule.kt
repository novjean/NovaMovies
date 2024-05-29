package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.data.datasouceImpl.MovieCacheDataSourceImpl
import com.novatech.novamovies.data.datasource.MovieCacheDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource() : MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }
}