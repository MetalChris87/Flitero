package com.lumacore.flitero.model

import androidx.compose.ui.graphics.Color

data class MetroTile(
    val id: Int,
    val title: String,
    val color: Color,
    val size: Size
) {
    enum class Size(val columns: Int, val rows: Int) {
        SMALL(1, 1),
        MEDIUM(2, 1),
        LARGE(2, 2)
    }
}