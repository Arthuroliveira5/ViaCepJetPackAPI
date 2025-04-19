package com.arthur.api.dependencias.di

import com.arthur.api.dependencias.data.remote.api.AddressAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun providesAddressAPI(
        retrofit: Retrofit
    ): AddressAPI {
        return retrofit.create(AddressAPI::class.java)
    }

}