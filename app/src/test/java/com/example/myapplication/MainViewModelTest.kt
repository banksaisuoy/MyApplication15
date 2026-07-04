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
    fun loadMockData_initializesLiveDataWithData() {
        // Arrange
        val viewModel = MainViewModel()

        // Act
        val mockDataList = viewModel.mockDataList.value

        // Assert
        assertNotNull(mockDataList)
        assertEquals(4, mockDataList?.size)
        assertEquals("Zero Defects Request", mockDataList?.get(0)?.title)
        assertEquals("Robust Tests", mockDataList?.get(3)?.title)
    }
}