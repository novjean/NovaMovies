package com.novatech.novamovies.data

import com.novatech.novamovies.data.datasource.MovieCacheDataSource
import com.novatech.novamovies.data.datasource.MovieLocalDataSource
import com.novatech.novamovies.data.datasource.MovieRemoteDataSource
import com.novatech.novamovies.data.domain.repository.MovieRepository
import com.novatech.novamovies.data.model.Movie
import java.lang.Exception

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {

    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies = getMoviesFromApi()
    }

    suspend fun getMoviesFromApi(): List<Movie> {
        lateinit var movieList:List<Movie>

        try{
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()

            if(body!=null){
                movieList=body.movies
            }

        } catch (e:Exception){

        }
        return movieList
    }

    suspend fun getMoviesFromRoom() : List<Movie> {
        lateinit var movieList: List<Movie>
        try{
            movieList = movieLocalDataSource.getMoviesFromDb()
        } catch(exception: Exception){

        }

        if(movieList.size>0){
            return movieList
        } else {
            movieList = getMoviesFromApi()
            movieLocalDataSource.saveMoviesToDb(movieList)
        }
        return movieList
    }

    private fun getMoviesFromCache(): List<Movie>? {
        
    }
}