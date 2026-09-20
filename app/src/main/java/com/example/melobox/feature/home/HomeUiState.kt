package com.example.melobox.feature.home

import com.example.melobox.model.Song
import com.example.melobox.model.User

data class HomeUiState(
    val user: User? = null,

    val isLoading: Boolean = false,

    val recentlyPlayed: List<Song> = emptyList(),

    val recommendedSongs: List<Song> = emptyList(),

    val errorMessage: String? = null
)