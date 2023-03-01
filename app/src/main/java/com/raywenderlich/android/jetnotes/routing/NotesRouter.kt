package com.raywenderlich.android.jetnotes.routing

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Класс, определяющий все возможные экраны в приложении.
 */
sealed class Screen {
  object Notes : Screen()
  object SaveNote : Screen()
  object Trash : Screen()
}

/**
 * Позволяет менять экран в [MainActivity]
 *
 * Также отслеживает текущий экран.
 */
object JetNotesRouter {
  var currentScreen: Screen by mutableStateOf(Screen.Notes)

  fun navigateTo(destination: Screen) {
    currentScreen = destination
  }
}
