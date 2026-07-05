package com.example.myapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun testItemsAreLoaded() {
        val viewModel = MainViewModel()

        val items = viewModel.items.value
        assertNotNull("Items should not be null", items)
        assertEquals("Should load 5 items", 5, items?.size)

        val firstItem = items?.get(0)
        assertEquals("1", firstItem?.id)
        assertEquals("Majestic Mountains", firstItem?.title)
    }
}
