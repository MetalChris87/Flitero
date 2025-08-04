package com.lumacore.flitero.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lumacore.flitero.model.MetroTile

@Composable
fun MetroTileGrid(
    tiles: List<MetroTile>,
    modifier: Modifier = Modifier
) {
    // Simple row display; can be replaced with custom grid arrangement as needed
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        tiles.forEach { tile ->
            MetroTileItem(tile = tile)
        }
    }
}

@Composable
fun MetroTileItem(tile: MetroTile) {
    Box(
        modifier = Modifier
            .size(tile.size.columns * 80.dp, tile.size.rows * 80.dp)
            .background(tile.color)
            .padding(8.dp)
    ) {
        Text(text = tile.title)
    }
}
