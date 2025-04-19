package com.arthur.api.dependencias.data.remote.repository

import com.arthur.api.dependencias.data.remote.api.AddressAPI
import com.arthur.api.dependencias.data.remote.model.AddressResponse
import com.arthur.api.dependencias.domain.remote.repository.AddressRemoteRepository
import javax.inject.Inject

class AddressRemoteRepositoryImpl @Inject constructor(
    private val addressAPI : AddressAPI
):AddressRemoteRepository {
    override suspend fun getAddress(zipcode: String): AddressResponse {
        return addressAPI.getAddress(zipcode)
    }
}