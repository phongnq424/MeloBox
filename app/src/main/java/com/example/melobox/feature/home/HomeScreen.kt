package com.example.melobox.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.melobox.R
import com.example.melobox.feature.home.components.HomeHeader
import com.example.melobox.feature.home.components.SectionHeader
import com.example.melobox.feature.home.components.SongCard
import com.example.melobox.model.Song

@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onSongClick: (Song) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize().safeDrawingPadding(),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        item {
            HomeHeader(modifier, uiState.user)
        }

        item {
            SectionHeader(
                title = stringResource(R.string.recent_played)
            )

            LazyRow(
                contentPadding = PaddingValues(
                    horizontal = 16.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                items(
                    items = uiState.recentlyPlayed,
                    key = { song -> song.id }
                ) { song ->

                    SongCard(
                        song = song,
                        onClick = {
                            onSongClick(song)
                        }
                    )
                }
            }
        }

        item {
            SectionHeader(
                title = stringResource(R.string.for_you)
            )

            LazyRow(
                contentPadding = PaddingValues(
                    horizontal = 16.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                items(
                    items = uiState.recommendedSongs,
                    key = { song -> song.id }
                ) { song ->

                    SongCard(
                        song = song,
                        onClick = {
                            onSongClick(song)
                        }
                    )
                }
            }
        }
    }
}