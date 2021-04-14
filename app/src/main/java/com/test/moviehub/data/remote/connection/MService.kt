package com.test.moviehub.data.remote.connection

import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MService {

    //search movies
    @GET("search/movie")
    suspend fun searchMovies(
        @Query("query") searchKeyword: String,
        @Query("page") page: Int
    ): MoviesResponse

    //popular movies
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("page") page: Int
    ): MoviesResponse

    //get details of a movie
    @GET("movie/{movie_id}")
    suspend fun getDetails(
        @Path(
            value = "movie_id",
            encoded = true
        ) movieId: Int
    ): GetDetailsResponse

}