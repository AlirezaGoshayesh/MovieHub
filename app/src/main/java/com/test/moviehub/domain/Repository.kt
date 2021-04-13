package com.test.moviehub.domain

import androidx.paging.PagingData
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MovieResult
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun searchMovies(searchKeyword: String): Flow<PagingData<MovieResult>>

    suspend fun getDetails(movieId: String): GetDetailsResponse

}
