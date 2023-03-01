package com.raywenderlich.android.jetnotes.viewmodel

import androidx.lifecycle.ViewModel
import com.raywenderlich.android.jetnotes.data.repository.Repository

/**
 * View model used for storing the global app state.
 *
 * This view model is used for all screens.
 */
class MainViewModel(private val repository: Repository) : ViewModel() {

}
