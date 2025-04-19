package com.arthur.api.dependencias.domain.remote.model

import com.google.gson.annotations.SerializedName

data class Address(

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

{
    override fun toString(): String {
        return "$zipcode, $neighborhood, $city, $street, $uf"


    }




}