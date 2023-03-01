package com.raywenderlich.android.jetnotes

import android.app.Application
import com.raywenderlich.android.jetnotes.dependencyinjection.DependencyInjector

/**
 * Класс приложения, отвечающий за инициализацию и выполнение зависимостей.
 */
class NotesApplication : Application() {

  lateinit var dependencyInjector: DependencyInjector

  override fun onCreate() {
    super.onCreate()
    initDependencyInjector()
  }

  private fun initDependencyInjector() {
    dependencyInjector = DependencyInjector(this)
  }
}
