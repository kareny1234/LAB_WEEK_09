package com.example.lab_week_09.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = SoftTeal,
    onPrimary = Color.White,
    secondary = MintGreen,
    background = BackgroundLight,
    onBackground = DarkGray,
    surface = LightGray,
    onSurface = DarkGray
)

private val DarkColors = darkColorScheme(
    primary = DarkTeal,
    onPrimary = Color.White,
    secondary = SoftTeal,
    background = BackgroundDark,
    onBackground = Color.White,
    surface = DarkTeal,
    onSurface = Color.White
)

@Composable
fun LAB_WEEK_09Theme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
