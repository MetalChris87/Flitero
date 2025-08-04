package com.lumacore.flitero.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lumacore.flitero.model.MetroTile

@Composable
fun MetroTileItem(tile: MetroTile) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .background(tile.color)
            .size(
                when (tile.size) {
                    MetroTile.Size.SMALL -> 64.dp
                    MetroTile.Size.MEDIUM -> 96.dp
                    MetroTile.Size.LARGE -> 128.dp
                }
            )
    ) {
        Text(text = tile.title, modifier = Modifier.padding(8.dp))
    }
}