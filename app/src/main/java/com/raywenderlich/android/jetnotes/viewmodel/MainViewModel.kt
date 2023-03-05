package com.raywenderlich.android.jetnotes.viewmodel

import androidx.lifecycle.ViewModel
import com.raywenderlich.android.jetnotes.data.repository.Repository

/**
 * Модель просмотра, используемая для хранения глобального состояния приложения.
 *
 * Эта модель просмотра используется для всех экранов.
 */
class MainViewModel(private val repository: Repository) : ViewModel() {

}
