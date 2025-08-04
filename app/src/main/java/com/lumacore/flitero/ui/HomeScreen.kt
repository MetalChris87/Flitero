package com.lumacore.flitero.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lumacore.flitero.model.MetroTile

@Composable
fun HomeScreen(
    tiles: List<MetroTile>,
    onTileDragged: (Int, androidx.compose.ui.geometry.Offset) -> Unit,
    onTileResized: (Int, MetroTile.Size) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Flitero Home") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            MetroTileGrid(
                tiles = tiles,
                onTileDragged = onTileDragged,
                onTileResized = onTileResized
            )
        }
    }
}