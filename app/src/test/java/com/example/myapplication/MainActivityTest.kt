package com.example.myapplication

import android.os.Build
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainActivityTest {

    @Test
    fun mainActivity_initializesRecyclerViewAndDisplaysData() {
        // Launch the activity using ActivityScenario
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        scenario.onActivity { activity ->
            // Verify RecyclerView is present
            val recyclerView = activity.findViewById<RecyclerView>(R.id.recyclerView)
            assertNotNull("RecyclerView should not be null", recyclerView)

            // Verify the adapter is attached
            val adapter = recyclerView.adapter as MockDataAdapter
            assertNotNull("Adapter should be attached to RecyclerView", adapter)

            // Wait for data to be submitted (since it's done synchronously in ViewModel init)
            // Verify data size
            assertEquals("Adapter should have 4 items", 4, adapter.itemCount)

            // Layout views might not be synchronously laid out in Robolectric without explicit triggers
            // But we can check the adapter data
        }
        scenario.close()
    }
}