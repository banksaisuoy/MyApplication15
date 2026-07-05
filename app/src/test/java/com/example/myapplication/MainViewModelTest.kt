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
    fun testViewModel_initializesWithMockData() {
        val viewModel = MainViewModel()
        val items = viewModel.items.value

        assertNotNull(items)
        assertEquals(4, items?.size)
        assertEquals("Item One", items?.get(0)?.title)
        assertEquals("1", items?.get(0)?.id)
    }
}
