package com.arthur.api.dependencias.data.remote.mapper

import com.arthur.api.dependencias.data.remote.model.AddressResponse
import com.arthur.api.dependencias.domain.remote.model.Address

fun AddressResponse.toDomain(): Address{

    return Address(
        zipcode=zipcode,
        neighborhood=neighborhood,
        city=city,
        street=street,
        uf=uf



            )


}