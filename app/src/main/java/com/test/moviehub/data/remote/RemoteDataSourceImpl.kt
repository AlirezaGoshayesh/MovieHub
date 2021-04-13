package com.test.moviehub.data.remote

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.test.moviehub.data.model.GetDetailsResponse
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.data.remote.connection.MService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val service: MService) :
    RemoteDataSource {
    override suspend fun searchMovies(searchKeyword: String): Flow<PagingData<MovieResult>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = 30),
            pagingSourceFactory = {
                SearchResultsDataSource(service, searchKeyword)
            }
        ).flow
    }

    override suspend fun getDetails(movieId: String): GetDetailsResponse {
        return service.getDetails(movieId)
    }

}