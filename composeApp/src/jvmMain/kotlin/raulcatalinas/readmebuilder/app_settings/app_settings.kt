package raulcatalinas.readmebuilder.app_settings

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPosition

object WindowSettings {
    val WIDTH: Dp = 800.dp
    val HEIGTH: Dp = 600.dp
    const val TITLE = "README Builder"
    const val RESIZABLE = false
    val POSITION = WindowPosition(Alignment.Center)
}