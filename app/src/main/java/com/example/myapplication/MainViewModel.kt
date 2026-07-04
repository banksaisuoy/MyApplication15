package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class MockData(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String
)

class MainViewModel : ViewModel() {

    private val _mockDataList = MutableLiveData<List<MockData>>()
    val mockDataList: LiveData<List<MockData>> get() = _mockDataList

    init {
        loadMockData()
    }

    private fun loadMockData() {
        val data = listOf(
            MockData(1, "Zero Defects Request", "Write rigorous tests and fix all bugs.", "https://picsum.photos/id/10/200"),
            MockData(2, "Breathtaking UI", "Implement MVVM architecture with Material Design 3.", "https://picsum.photos/id/11/200"),
            MockData(3, "Performance Bottlenecks", "Ensure application is absolutely bulletproof and fast.", "https://picsum.photos/id/12/200"),
            MockData(4, "Robust Tests", "Write robust Robolectric and Espresso tests.", "https://picsum.photos/id/13/200")
        )
        _mockDataList.value = data
    }
}