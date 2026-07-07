package com.example.myapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class SettingsViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: SettingsRepository = LocalSettingsRepository(application)

    private val _isDarkModeEnabled = MutableLiveData<Boolean>()
    val isDarkModeEnabled: LiveData<Boolean> = _isDarkModeEnabled

    init {
        _isDarkModeEnabled.value = repository.isDarkModeEnabled()
    }

    fun setDarkMode(enabled: Boolean) {
        repository.setDarkModeEnabled(enabled)
        _isDarkModeEnabled.value = enabled
    }
}
