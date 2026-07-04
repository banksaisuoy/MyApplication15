package com.example.myapplication.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Item
import com.example.myapplication.data.ItemRepository

class MainViewModel(private val repository: ItemRepository = ItemRepository()) : ViewModel() {

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> = _items

    init {
        loadItems()
    }

    fun loadItems() {
        _items.value = repository.getItems()
    }
}
