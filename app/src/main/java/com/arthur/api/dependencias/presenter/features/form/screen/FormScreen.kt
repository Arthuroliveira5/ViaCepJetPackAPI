package com.arthur.api.dependencias.presenter.features.form.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType

import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.arthur.api.dependencias.presenter.app.ui.components.card.AdressCard


import com.arthur.api.dependencias.presenter.app.ui.components.textfield.DefaultTextField
import com.arthur.api.dependencias.presenter.features.form.action.FormAction
import com.arthur.api.dependencias.presenter.features.form.state.FormState
import com.arthur.api.dependencias.presenter.features.form.viewmodel.FormViewModel
import okhttp3.Address


@Composable
fun FormScreen() {
val viewModel: FormViewModel=viewModel()
    //obter sempre o ultimo valor de state
    val state = viewModel.state.collectAsState().value

    FormContent(
        state = state,
        action = viewModel::action

    )
}

@Composable
fun FormContent(
    //1
    state: FormState ,
    action: (FormAction) -> Unit
) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        DefaultTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end  = 16.dp, top = 16.dp),
            value = state.search   ,
            label = "digite seu CEP",
            placeholder = "00000-000",
            singleLine = true,
            charLimit = 8,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            shape = RoundedCornerShape(16.dp),
            onValueChange = {
               action(FormAction.UpdateSearchAddress(it))

            }
        )

        //Colocar ressultados na tela
LazyColumn(
modifier = Modifier.fillMaxSize(),
    contentPadding = PaddingValues(16.dp),
    verticalArrangement = Arrangement.spacedBy(16.dp)

) {

    items(state.addressess) {address->
        AdressCard( address=address)




    }
}



    }
}

@Preview
@Composable
private fun FormPreview() {

    FormContent(
        state = FormState(),
        action = {}

    )
}