package com.arthur.api.dependencias.di

import com.arthur.api.dependencias.data.remote.repository.AddressRemoteRepositoryImpl
import com.arthur.api.dependencias.domain.remote.repository.AddressRemoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsAddressRemoteRepositoryImpl(

        addressRemoteRepositoryImpl: AddressRemoteRepositoryImpl


    ): AddressRemoteRepository

}