package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _items = MutableLiveData<List<ItemModel>>()
    val items: LiveData<List<ItemModel>> = _items

    init {
        loadData()
    }

    fun loadData() {
        // Auto-mocking data as per requirements
        val mockData = ItemModel.createMocks(20)
        _items.value = mockData
    }
}
