package com.arthur.api.dependencias.domain.remote.repository

import com.arthur.api.dependencias.data.remote.model.AddressResponse

interface AddressRemoteRepository {

    suspend fun getAddress(zipcode:String): AddressResponse
}