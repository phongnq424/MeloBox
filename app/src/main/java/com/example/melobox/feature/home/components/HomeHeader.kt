package com.example.melobox.feature.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.melobox.R
import com.example.melobox.model.User
import com.example.melobox.ui.theme.MeloBoxTheme

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier,
    user: User? = null,
    onNotificationClick: () -> Unit,
    onAvatarClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Column {
            Text(
                text = stringResource(R.string.home_greeting_morning),
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Light
            )
            Text(
                text = user?.userName?:"User",
                style = MaterialTheme.typography.headlineSmall
            )
        }


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            IconButton(
                onClick = onNotificationClick
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_notifications),
                    contentDescription = stringResource(R.string.notification),
                    modifier = Modifier.size(24.dp)
                )
            }

            IconButton(
                onClick = onAvatarClick
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_profile),
                    contentDescription = stringResource(R.string.open_profile),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(40.dp).clip(CircleShape)
                )

            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun HomeHeaderPreview() {
    MeloBoxTheme {
        HomeHeader(
            user = User(
                id = 1,
                userName = "Phong"
            ),
            onNotificationClick = {},
            onAvatarClick = {}
        )
    }
}