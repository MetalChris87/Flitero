package com.lumacore.flitero.model

import androidx.compose.ui.graphics.Color

val sampleMetroTiles = listOf(
    MetroTile(
        id = 1,
        title = "Calendar",
        color = Color(0xFF1E88E5),
        size = MetroTile.Size.SMALL
    ),
    MetroTile(
        id = 2,
        title = "Mail",
        color = Color(0xFFD81B60),
        size = MetroTile.Size.MEDIUM
    ),
    MetroTile(
        id = 3,
        title = "Weather",
        color = Color(0xFF43A047),
        size = MetroTile.Size.LARGE
    ),
    MetroTile(
        id = 4,
        title = "Gallery",
        color = Color(0xFFFDD835),
        size = MetroTile.Size.SMALL
    )
)