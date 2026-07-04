package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.myapplication.data.Item
import com.example.myapplication.data.ItemRepository
import com.example.myapplication.ui.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `loadItems populates LiveData with mocked items`() {
        // Arrange
        val mockItems = listOf(
            Item("1", "Title 1", "Desc 1", "url1"),
            Item("2", "Title 2", "Desc 2", "url2")
        )
        val mockRepository = object : ItemRepository() {
            override fun getItems(): List<Item> {
                return mockItems
            }
        }

        // Act
        val viewModel = MainViewModel(mockRepository)

        // Assert
        assertNotNull(viewModel.items.value)
        assertEquals(2, viewModel.items.value?.size)
        assertEquals("Title 1", viewModel.items.value?.get(0)?.title)
    }
}
