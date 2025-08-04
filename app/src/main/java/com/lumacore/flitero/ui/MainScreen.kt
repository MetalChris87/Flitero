package com.lumacore.flitero.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lumacore.flitero.model.sampleMetroTiles

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    MetroTileGrid(
        tiles = sampleMetroTiles,
        modifier = modifier
    )
}