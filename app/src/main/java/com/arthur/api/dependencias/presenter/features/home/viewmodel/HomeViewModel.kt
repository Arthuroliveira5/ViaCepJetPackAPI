package com.arthur.api.dependencias.presenter.features.home.viewmodel

import androidx.lifecycle.ViewModel
import com.arthur.api.dependencias.presenter.features.form.action.FormAction
import com.arthur.api.dependencias.presenter.features.home.state.HomeState

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {
        private val _state = MutableStateFlow(HomeState())
            var state: StateFlow<HomeState> = _state

init {

}


    fun action(action: FormAction){



    }



}