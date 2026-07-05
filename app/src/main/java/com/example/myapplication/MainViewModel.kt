package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Feature(
    val id: String,
    val title: String,
    val description: String,
    val iconUrl: String
)

class MainViewModel : ViewModel() {

    private val _features = MutableLiveData<List<Feature>>()
    val features: LiveData<List<Feature>> = _features

    init {
        loadMockData()
    }

    private fun loadMockData() {
        val mockFeatures = listOf(
            Feature("1", "Advanced Analytics", "Deep dive into your user engagement and retention metrics.", "https://via.placeholder.com/150/92c952"),
            Feature("2", "AI Insights", "Leverage machine learning to predict market trends.", "https://via.placeholder.com/150/771796"),
            Feature("3", "Cloud Sync", "Instant synchronization across all your connected devices.", "https://via.placeholder.com/150/24f355"),
            Feature("4", "Secure Vault", "Military-grade encryption for your most sensitive data.", "https://via.placeholder.com/150/d32776"),
            Feature("5", "Priority Support", "24/7 dedicated support team at your fingertips.", "https://via.placeholder.com/150/f66b97")
        )
        _features.value = mockFeatures
    }
}
