package com.flitero.launcher.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object ThemeManager {
    
    // Metro-inspired color palette
    private val MetroBlue = Color(0xFF0078D4)
    private val MetroLightBlue = Color(0xFF40E0FF)
    private val MetroDarkBlue = Color(0xFF004578)
    
    private val DarkColorScheme = darkColorScheme(
        primary = MetroBlue,
        secondary = MetroLightBlue,
        tertiary = MetroDarkBlue,
        background = Color.Black,
        surface = Color(0xFF1A1A1A),
        onPrimary = Color.White,
        onSecondary = Color.White,
        onTertiary = Color.White,
        onBackground = Color.White,
        onSurface = Color.White,
    )

    private val LightColorScheme = lightColorScheme(
        primary = MetroBlue,
        secondary = MetroDarkBlue,
        tertiary = MetroLightBlue,
        background = Color.White,
        surface = Color(0xFFF5F5F5),
        onPrimary = Color.White,
        onSecondary = Color.White,
        onTertiary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
    )

    @Composable
    fun FliteroTheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ) {
        val colorScheme = when {
            darkTheme -> DarkColorScheme
            else -> LightColorScheme
        }

        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}