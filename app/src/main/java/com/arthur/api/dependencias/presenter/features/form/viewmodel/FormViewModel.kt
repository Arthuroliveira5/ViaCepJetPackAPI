package com.arthur.api.dependencias.presenter.features.form.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arthur.api.dependencias.domain.remote.usescase.GetAddressUseCase
import com.arthur.api.dependencias.presenter.features.form.action.FormAction
import com.arthur.api.dependencias.presenter.features.form.state.FormState
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FormViewModel @Inject constructor(

    private val getAddressUseCase: GetAddressUseCase


) : ViewModel() {
    private val _state = MutableStateFlow(FormState())
    var state: StateFlow<FormState> = _state

    init {

    }


    fun action(action: FormAction) {
        when (action) {
            FormAction.SearchAddress -> {
                searchAddress()


            }

            is FormAction.UpdateSearchAddress -> {
                _state.update { currentState ->
                    currentState.copy(
                        search = action.search
                    )

                }

                searchAddress()
            }
        }


    }

    //nao precisa passar o cep como parametro pois esta no FormState
    private fun searchAddress() {
        viewModelScope.launch {

            if(_state.value.search.length==8){

                val addressResponse = getAddressUseCase(_state.value.search)

                val currentAddress = _state.value.addressess.toMutableList().apply {


                    add(addressResponse)
                }

                _state.update { currentState ->
                    currentState.copy(
                        addressess = currentAddress
                    )
                }






            }


        }

    }

}