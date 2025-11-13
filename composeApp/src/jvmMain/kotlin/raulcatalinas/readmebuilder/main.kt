package raulcatalinas.readmebuilder

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import raulcatalinas.readmebuilder.app_settings.WindowSettings

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = WindowSettings.TITLE,
        resizable = WindowSettings.RESIZABLE,
        state = rememberWindowState(
            position = WindowSettings.POSITION,
            width = WindowSettings.WIDTH,
            height = WindowSettings.HEIGTH
        )
    ) {
        App()
    }
}