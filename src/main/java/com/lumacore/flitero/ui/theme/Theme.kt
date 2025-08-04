package com.lumacore.flitero.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun FliteroTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkColorScheme else lightColorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}

// Define your light and dark color schemes here
val lightColorScheme = androidx.compose.material3.lightColorScheme(
    primary = Blue500,
    secondary = Red500
    // Add other colors as needed
)

val darkColorScheme = androidx.compose.material3.darkColorScheme(
    primary = Blue500,
    secondary = Red500
    // Add other colors as needed
)