package com.novatech.novamovies.presentation.di

import android.content.Context
import androidx.room.Room
import com.novatech.novamovies.data.db.MovieDao
import com.novatech.novamovies.data.db.TmdbDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context): TmdbDatabase {
        return Room.databaseBuilder(context, TmdbDatabase::class.java, "tmdbclient")
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TmdbDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }
}