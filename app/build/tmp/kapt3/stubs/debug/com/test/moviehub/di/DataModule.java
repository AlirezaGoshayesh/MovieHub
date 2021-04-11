package com.test.moviehub.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/test/moviehub/di/DataModule;", "", "()V", "provideErrorHandler", "Lcom/test/moviehub/domain/exceptions/IErrorHandler;", "provideRemoteDataSource", "Lcom/test/moviehub/data/remote/RemoteDataSource;", "service", "Lcom/test/moviehub/data/remote/connection/MService;", "provideRepository", "Lcom/test/moviehub/domain/Repository;", "remoteDataSourceImpl", "Lcom/test/moviehub/data/remote/RemoteDataSourceImpl;", "app_debug"})
@dagger.Module()
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.moviehub.di.DataModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.test.moviehub.domain.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.data.remote.RemoteDataSourceImpl remoteDataSourceImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.test.moviehub.data.remote.RemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.test.moviehub.data.remote.connection.MService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.test.moviehub.domain.exceptions.IErrorHandler provideErrorHandler() {
        return null;
    }
    
    private DataModule() {
        super();
    }
}