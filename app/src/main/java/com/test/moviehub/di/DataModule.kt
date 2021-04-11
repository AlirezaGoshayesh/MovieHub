package com.test.moviehub.di

import com.test.moviehub.data.RepositoryImpl
import com.test.moviehub.data.remote.RemoteDataSource
import com.test.moviehub.data.remote.RemoteDataSourceImpl
import com.test.moviehub.data.remote.connection.MService
import com.test.moviehub.domain.Repository
import com.test.moviehub.domain.exceptions.IErrorHandler
import com.vada.parents.data.ErrorHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideRepository(
        remoteDataSourceImpl: RemoteDataSourceImpl,
    ): Repository {
        return RepositoryImpl(remoteDataSourceImpl)
    }

    @Singleton
    @Provides
    fun provideRemoteDataSource(
        service: MService
    ): RemoteDataSource {
        return RemoteDataSourceImpl(service)
    }

    @Singleton
    @Provides
    fun provideErrorHandler(): IErrorHandler {
        return ErrorHandler()
    }
}