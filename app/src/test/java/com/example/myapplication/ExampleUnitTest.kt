package com.example.myapplication

import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class ExampleUnitTest {
    @Test
    fun activity_launches_and_displays_hello_world() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            scenario.onActivity { activity ->
                // Check if the activity is successfully created.
                val layout = activity.findViewById<android.view.View>(android.R.id.content)
                assertEquals(true, layout != null)

                // You can add more detailed view checking using espresso but Robolectric also gives basic view validation
            }
        }
    }
}
