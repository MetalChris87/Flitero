package com.lumacore.flitero.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lumacore.flitero.model.MetroTile

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MetroTileGrid(
    tiles: List<MetroTile>,
    onTileDragged: (Int, Offset) -> Unit,
    onTileResized: (Int, MetroTile.Size) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(8.dp)
    ) {
        itemsIndexed(tiles) { idx, tile ->
            MetroTileItem(
                tile = tile,
                onDragged = { offset -> onTileDragged(idx, offset) },
                onResized = { newSize -> onTileResized(idx, newSize) }
            )
        }
    }
}