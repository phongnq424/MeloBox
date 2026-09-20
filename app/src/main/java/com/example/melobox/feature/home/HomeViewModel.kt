package com.example.melobox.feature.home

import androidx.lifecycle.ViewModel
import com.example.melobox.model.Song
import com.example.melobox.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        HomeUiState(
            User(
                id = 1,
                userName = "Phong"
            ),
            recentlyPlayed = listOf(
                Song(
                    id = 1,
                    title = "Die With A Smile",
                    artist = "Lady Gaga & Bruno Mars"
                ),
                Song(
                    id = 2,
                    title = "APT.",
                    artist = "ROSÉ & Bruno Mars"
                ),
                Song(
                    id = 3,
                    title = "Birds of a Feather",
                    artist = "Billie Eilish"
                )
            ),

            recommendedSongs = listOf(
                Song(
                    id = 4,
                    title = "Espresso",
                    artist = "Sabrina Carpenter"
                ),
                Song(
                    id = 5,
                    title = "Beautiful Things",
                    artist = "Benson Boone"
                ),
                Song(
                    id = 6,
                    title = "Too Sweet",
                    artist = "Hozier"
                )
            )
        )
    )

    val uiState: StateFlow<HomeUiState> =
        _uiState.asStateFlow()

    fun onSongClick(song: Song) {
        // Sau này:
        // mở Player / play song
    }
}