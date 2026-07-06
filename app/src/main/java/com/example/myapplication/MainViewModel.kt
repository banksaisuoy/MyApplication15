package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _mockData = MutableLiveData<String>()
    val mockData: LiveData<String> get() = _mockData

    fun loadMockData() {
        _mockData.value = "Hello MVVM!"
    }
}
