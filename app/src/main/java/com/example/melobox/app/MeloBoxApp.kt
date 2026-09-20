package com.example.melobox.app

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.melobox.feature.home.HomeRoute
import com.example.melobox.feature.home.HomeViewModel

@Composable
fun MeloBoxApp() {

    val homeViewModel: HomeViewModel = viewModel()

    HomeRoute(
        viewModel = homeViewModel
    )
}