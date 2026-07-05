package com.example.myapplication

import android.os.Build
import androidx.recyclerview.widget.RecyclerView
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.UPSIDE_DOWN_CAKE]) // API 34
class MainActivityTest {

    @Test
    fun testMainActivity_initializesAndPopulatesList() {
        val activity = Robolectric.buildActivity(MainActivity::class.java)
            .create()
            .resume()
            .get()

        assertNotNull(activity)

        val recyclerView = activity.findViewById<RecyclerView>(R.id.recyclerView)
        assertNotNull("RecyclerView should be present", recyclerView)

        val adapter = recyclerView.adapter as? ItemAdapter
        assertNotNull("ItemAdapter should be set", adapter)

        // The View Model initializes with 4 mock items immediately in its init{} block.
        // And the observe block should immediately set them in the adapter.
        assertEquals(4, adapter?.itemCount)
    }
}
