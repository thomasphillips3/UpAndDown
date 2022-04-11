package com.thomasphillips3.upanddown.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.thomasphillips3.upanddown.R

class UpAndDownPage : Page() {
    override fun verify(): Page = apply {
        onView(withId(R.id.main_content)).check(matches(isDisplayed()))
    }

    fun tapPlusButton() = apply {
        onView(withId(R.id.plus_button)).perform(click())
    }

    fun tapMinusButton() = apply {
        onView(withId(R.id.minus_button)).perform(click())
    }

    fun expectTotalToBe(i: Int) {
        onView(withId(R.id.number_text)).check(matches(withText(i.toString())))

    }
}
