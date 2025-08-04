package com.lumacore.flitero.model

import androidx.compose.ui.graphics.Color

data class MetroTile(
    val id: Int,
    val title: String,
    val color: Color,
    val size: Size
) {
    enum class Size {
        SMALL, MEDIUM, LARGE
    }
}