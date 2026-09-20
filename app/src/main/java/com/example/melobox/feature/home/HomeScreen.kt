package com.example.melobox.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.melobox.R
import com.example.melobox.feature.home.components.HomeHeader
import com.example.melobox.feature.home.components.HomeSearchBar
import com.example.melobox.feature.home.components.SectionHeader
import com.example.melobox.feature.home.components.SongCard
import com.example.melobox.model.Song
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onSongClick: (Song) -> Unit,
    modifier: Modifier = Modifier
) {
    var query by remember {
        mutableStateOf("")
    }

    LazyColumn(
        modifier = modifier.fillMaxSize().safeDrawingPadding(),
        contentPadding = PaddingValues(vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {
            HomeHeader(
                    modifier, uiState.user,
                    onNotificationClick = {},
                    onAvatarClick = {}
                )
        }

        item {
            HomeSearchBar(query, {query = it}, modifier = Modifier.padding(horizontal = 16.dp))
        }

        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
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
        }

        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
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
}