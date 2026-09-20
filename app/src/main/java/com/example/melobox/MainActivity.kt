package com.example.melobox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.melobox.app.MeloBoxApp
import com.example.melobox.ui.theme.MeloBoxTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            MeloBoxTheme {

                MeloBoxApp()
            }
        }
    }
}