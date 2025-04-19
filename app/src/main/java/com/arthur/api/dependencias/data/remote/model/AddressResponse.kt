package com.arthur.api.dependencias.data.remote.model

import com.google.gson.annotations.SerializedName

data class AddressResponse(

    @SerializedName("cep")
    val zipcode : String? = null,

    @SerializedName("bairro")
    val neighborhood: String? = null,

    @SerializedName("localidade")
    val city: String? = null,

    @SerializedName("logradouro")
    val street: String? = null,

    @SerializedName("uf")
    val uf: String? = null
)