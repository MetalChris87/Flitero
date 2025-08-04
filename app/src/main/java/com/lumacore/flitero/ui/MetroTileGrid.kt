package com.lumacore.flitero.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lumacore.flitero.model.MetroTile

@Composable
fun MetroTileGrid(tiles: List<MetroTile>, modifier: Modifier = Modifier) {
    // This is a placeholder. Replace with your grid implementation.
    Column(modifier = modifier) {
        tiles.forEach { tile ->
            MetroTileItem(tile = tile)
        }
    }
}