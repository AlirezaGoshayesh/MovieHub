package com.test.moviehub.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.test.moviehub.data.SearchType
import com.test.moviehub.data.model.MovieResult
import com.test.moviehub.data.model.MoviesResponse
import com.test.moviehub.data.remote.connection.MService

class MoviesResultsDataSource(
    private val service: MService,
    private val type: SearchType,
    private val query: String? = null
) :
    PagingSource<Int, MovieResult>() {

    private lateinit var response: MoviesResponse

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MovieResult> {
        return try {
            val nextPageNumber = params.key ?: 1
            if (type == SearchType.Search)
                response = service.searchMovies(query!!, nextPageNumber)
            else if (type == SearchType.Popular)
                response = service.getPopularMovies(nextPageNumber)
            LoadResult.Page(
                data = response.movieResults,
                prevKey = if (nextPageNumber > 1) nextPageNumber - 1 else null,
                nextKey = if (nextPageNumber < response.totalPages) nextPageNumber + 1 else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, MovieResult>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

}