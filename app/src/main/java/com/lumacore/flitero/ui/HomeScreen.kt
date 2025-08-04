package com.lumacore.flitero.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.lumacore.flitero.model.MetroTile

@Composable
fun HomeScreen(navController: NavHostController) {
    val metroTiles = remember { mutableStateListOf<MetroTile>() }
    // Example: Add some tiles if none exist
    if (metroTiles.isEmpty()) {
        metroTiles.addAll(
            listOf(
                MetroTile("Chrome", R.drawable.ic_chrome, MetroTile.Size.Large),
                MetroTile("WhatsApp", R.drawable.ic_whatsapp, MetroTile.Size.Medium),
                MetroTile("Instagram", R.drawable.ic_instagram, MetroTile.Size.Medium)
            )
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        MetroTileGrid(
            tiles = metroTiles,
            onTileDragged = { index, offset ->
                // Handle drag/reorder logic here
            },
            onTileResized = { index, newSize ->
                metroTiles[index] = metroTiles[index].copy(size = newSize)
            }
        )
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp),
            onClick = { navController.navigate("drawer") }
        ) {
            Icon(
                painterResource(id = R.drawable.ic_drawer),
                contentDescription = "Open App Drawer"
            )
        }
    }
}