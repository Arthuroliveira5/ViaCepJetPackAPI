package com.arthur.api.dependencias.presenter.features.form.state

import com.arthur.api.dependencias.domain.remote.model.Address

data class FormState(
    val isLoading: Boolean =false,
    val search: String="",

    //para receber o reusltado na ui
    val addressess : List<Address> = emptyList()


)
