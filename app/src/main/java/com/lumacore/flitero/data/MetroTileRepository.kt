package com.lumacore.flitero.data

import androidx.compose.ui.graphics.Color
import com.lumacore.flitero.model.MetroTile

object MetroTileRepository {
    fun getTiles(): List<MetroTile> = listOf(
        MetroTile(
            id = 1,
            title = "Weather",
            color = Color(0xFF42A5F5),
            size = MetroTile.Size.MEDIUM
        ),
        MetroTile(
            id = 2,
            title = "Calendar",
            color = Color(0xFFAB47BC),
            size = MetroTile.Size.SMALL
        ),
        MetroTile(
            id = 3,
            title = "Mail",
            color = Color(0xFF26A69A),
            size = MetroTile.Size.LARGE
        )
        // Add more tiles as needed
    )
}