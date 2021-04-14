package com.test.moviehub.data

import androidx.paging.PagingData
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.data.remote.RemoteDataSource
import com.test.moviehub.domain.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : Repository {
    override suspend fun searchMovies(searchKeyword: String): Flow<PagingData<MovieResult>> {
        return remoteDataSource.searchMovies(searchKeyword)
    }

    override suspend fun getPopularMovies(): Flow<PagingData<MovieResult>> {
        return remoteDataSource.getPopularMovies()
    }

    override suspend fun getDetails(movieId: Int): GetDetailsResponse {
        return remoteDataSource.getDetails(movieId)
    }

}