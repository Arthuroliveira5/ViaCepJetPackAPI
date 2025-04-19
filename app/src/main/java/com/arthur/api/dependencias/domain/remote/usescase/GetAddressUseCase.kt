package com.arthur.api.dependencias.domain.remote.usescase

import com.arthur.api.dependencias.data.remote.mapper.toDomain
import com.arthur.api.dependencias.domain.remote.model.Address
import com.arthur.api.dependencias.domain.remote.repository.AddressRemoteRepository
import javax.inject.Inject

class GetAddressUseCase @Inject constructor(
    private val repository: AddressRemoteRepository
) {
    suspend operator fun invoke(zipcode: String):Address{
        return repository.getAddress(zipcode).toDomain()


    }

}