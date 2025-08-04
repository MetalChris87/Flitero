package com.lumacore.flitero.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lumacore.flitero.model.MetroTile
import com.lumacore.flitero.ui.MetroTileItem

@Preview
@Composable
fun MetroTileItemPreview() {
    MetroTileItem(
        tile = MetroTile(
            id = 99,
            title = "Preview Tile",
            color = Blue500,
            size = MetroTile.Size.MEDIUM
        )
    )
}
