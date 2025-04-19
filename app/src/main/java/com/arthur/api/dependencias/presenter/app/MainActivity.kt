package com.arthur.api.dependencias.presenter.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.arthur.api.dependencias.presenter.app.ui.theme.DependenciasTheme
import com.arthur.api.dependencias.presenter.features.form.screen.FormScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DependenciasTheme {
                FormScreen()
            }
        }
    }
}


