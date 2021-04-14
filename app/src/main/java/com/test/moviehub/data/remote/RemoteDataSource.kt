package com.test.moviehub.data.remote

import androidx.paging.PagingData
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MovieResult
import kotlinx.coroutines.flow.Flow


interface RemoteDataSource {

    suspend fun searchMovies(searchKeyword: String): Flow<PagingData<MovieResult>>

    suspend fun getPopularMovies(): Flow<PagingData<MovieResult>>

    suspend fun getDetails(movieId: Int): GetDetailsResponse
}