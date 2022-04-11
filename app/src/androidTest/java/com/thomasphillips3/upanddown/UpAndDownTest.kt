package com.thomasphillips3.upanddown

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.thomasphillips3.upanddown.pages.Page
import com.thomasphillips3.upanddown.pages.UpAndDownPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UpAndDownTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun tapMinusButtonFiveTimes_expectTextViewIsNegativeFive() {

        Page.on<UpAndDownPage>()
            .tapMinusButton()
            .tapMinusButton()
            .tapMinusButton()
            .tapMinusButton()
            .tapMinusButton()
            .expectTotalToBe(-5)

    }
}
