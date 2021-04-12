package com.test.moviehub.data.remote.connection

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthTokenInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        proceed(
            request()
                .newBuilder()
                .addHeader(
                    "Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxMTA4NGY4NWVhOTBiYjdjYWYwMDVmOGExZjI4NTU4YSIsInN1YiI6IjYwNzJlMTVmOGRkYzM0MDA0MGE5NTliZiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.IEEpO7C7vDWS3gJBOtG0hNVn502Z8WdGynwssp6gexc"
                )
                .build()
        )
    }
}