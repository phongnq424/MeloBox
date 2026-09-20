package com.example.melobox.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.melobox.R

val LexendFontFamily = FontFamily(
    Font(
        resId = R.font.lexend_thin,
        weight = FontWeight.Thin
    ),
    Font(
        resId = R.font.lexend_extralight,
        weight = FontWeight.ExtraLight
    ),
    Font(
        resId = R.font.lexend_light,
        weight = FontWeight.Light
    ),
    Font(
        resId = R.font.lexend_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resId = R.font.lexend_medium,
        weight = FontWeight.Medium
    ),
    Font(
        resId = R.font.lexend_semibold,
        weight = FontWeight.SemiBold
    ),
    Font(
        resId = R.font.lexend_bold,
        weight = FontWeight.Bold
    ),
    Font(
        resId = R.font.lexend_extrabold,
        weight = FontWeight.ExtraBold
    ),
    Font(
        resId = R.font.lexend_black,
        weight = FontWeight.Black
    )
)

private val DefaultTypography = Typography()

private fun TextStyle.withLexend(): TextStyle {
    return copy(
        fontFamily = LexendFontFamily
    )
}

val MeloBoxTypography = Typography(
    displayLarge = DefaultTypography.displayLarge.withLexend(),
    displayMedium = DefaultTypography.displayMedium.withLexend(),
    displaySmall = DefaultTypography.displaySmall.withLexend(),

    headlineLarge = DefaultTypography.headlineLarge.withLexend(),
    headlineMedium = DefaultTypography.headlineMedium.withLexend(),
    headlineSmall = DefaultTypography.headlineSmall.withLexend(),

    titleLarge = DefaultTypography.titleLarge.withLexend(),
    titleMedium = DefaultTypography.titleMedium.withLexend(),
    titleSmall = DefaultTypography.titleSmall.withLexend(),

    bodyLarge = DefaultTypography.bodyLarge.withLexend(),
    bodyMedium = DefaultTypography.bodyMedium.withLexend(),
    bodySmall = DefaultTypography.bodySmall.withLexend(),

    labelLarge = DefaultTypography.labelLarge.withLexend(),
    labelMedium = DefaultTypography.labelMedium.withLexend(),
    labelSmall = DefaultTypography.labelSmall.withLexend()
)