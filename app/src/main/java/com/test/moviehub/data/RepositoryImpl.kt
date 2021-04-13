package com.test.moviehub.data

import com.test.moviehub.data.remote.RemoteDataSource
import com.test.moviehub.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : Repository {

}