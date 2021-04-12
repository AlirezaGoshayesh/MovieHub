package com.test.moviehub.data.remote.connection

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MService {

    //search movies
    @GET("search/movie")
    suspend fun searchMovies(@Query("query") searchKeyword: String)

    //get details of a movie
    @GET("movie/{movie_id}")
    suspend fun getDetails(@Path(value = "movie_id", encoded = true) movieId: String)

}