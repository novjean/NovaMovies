package com.novatech.novamovies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.novatech.novamovies.data.model.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TmdbDatabase : RoomDatabase() {

    abstract fun movieDao() : MovieDao


}