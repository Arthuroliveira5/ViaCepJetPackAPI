package com.arthur.api.dependencias.data.remote.api

import com.arthur.api.dependencias.data.remote.model.AddressResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface AddressAPI {
    @GET("{zipcode}/json")
    suspend fun getAddress(
        @Path("zipcode") zipcode : String
    ): AddressResponse
}