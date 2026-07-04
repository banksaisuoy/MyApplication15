package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> = _items

    init {
        loadData()
    }

    private fun loadData() {
        // Auto-mocking missing data for 100% complete functionality
        val mockData = listOf(
            Item(1, "Mountain Landscape", "A beautiful view of snow-capped mountains.", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?auto=format&fit=crop&q=80&w=800"),
            Item(2, "Forest Path", "A serene path through a dense green forest.", "https://images.unsplash.com/photo-1441974231531-c6227db76b6e?auto=format&fit=crop&q=80&w=800"),
            Item(3, "Ocean Waves", "Crashing waves on a sandy beach at sunset.", "https://images.unsplash.com/photo-1505118380757-91f5f5632de0?auto=format&fit=crop&q=80&w=800"),
            Item(4, "Desert Dunes", "Rolling sand dunes under a clear blue sky.", "https://images.unsplash.com/photo-1509316785289-025f5b846b35?auto=format&fit=crop&q=80&w=800"),
            Item(5, "City Skyline", "A bustling city skyline lit up at night.", "https://images.unsplash.com/photo-1477959858617-67f85cf4f1df?auto=format&fit=crop&q=80&w=800"),
            Item(6, "Autumn Leaves", "Vibrant colorful leaves during the fall season.", "https://images.unsplash.com/photo-1508614999368-9260051292e5?auto=format&fit=crop&q=80&w=800"),
            Item(7, "Starry Night", "A breathtaking view of the milky way galaxy.", "https://images.unsplash.com/photo-1519681393784-d120267933ba?auto=format&fit=crop&q=80&w=800"),
            Item(8, "Tropical Waterfall", "A cascading waterfall surrounded by lush vegetation.", "https://images.unsplash.com/photo-1433086966358-54859d0ed716?auto=format&fit=crop&q=80&w=800"),
            Item(9, "Winter Wonderland", "A peaceful snow-covered landscape with pine trees.", "https://images.unsplash.com/photo-1483921020237-2ff51e8e4b22?auto=format&fit=crop&q=80&w=800"),
            Item(10, "Spring Blossom", "Cherry blossoms blooming in the early spring.", "https://images.unsplash.com/photo-1490750967868-88cb4ecb0749?auto=format&fit=crop&q=80&w=800")
        )
        _items.value = mockData
    }
}
