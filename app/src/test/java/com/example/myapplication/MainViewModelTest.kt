package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `viewModel initializes with auto-mocked data correctly`() {
        // Given
        val viewModel = MainViewModel()

        // When
        val items = viewModel.items.value

        // Then
        assertEquals(10, items?.size)
        assertEquals(1, items?.get(0)?.id)
        assertEquals("Mountain Landscape", items?.get(0)?.title)
        assertEquals("A beautiful view of snow-capped mountains.", items?.get(0)?.description)
        assertEquals("https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?auto=format&fit=crop&q=80&w=800", items?.get(0)?.imageUrl)
    }
}
