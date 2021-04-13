package com.test.moviehub.data.remote

import com.test.moviehub.data.remote.connection.MService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val service: MService) :
    RemoteDataSource {

}