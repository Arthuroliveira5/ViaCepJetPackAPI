package com.arthur.api.dependencias.presenter.features.form.action

sealed class FormAction{

//nao precisa colocar parametro pois esta no FoirmnState
    data object SearchAddress : FormAction()
    data class UpdateSearchAddress(val search: String) : FormAction()


}