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

    private fun loadData() {
        val mockData = listOf(
            ItemModel("1", "Item One", "https://via.placeholder.com/150/0000FF/808080?Text=1"),
            ItemModel("2", "Item Two", "https://via.placeholder.com/150/FF0000/FFFFFF?Text=2"),
            ItemModel("3", "Item Three", "https://via.placeholder.com/150/FFFF00/000000?Text=3"),
            ItemModel("4", "Item Four", "https://via.placeholder.com/150/000000/FFFFFF?Text=4")
        )
        _items.value = mockData
    }
}
