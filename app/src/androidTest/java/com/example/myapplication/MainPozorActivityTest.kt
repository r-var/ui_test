package com.example.myapplication

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.not


@RunWith(AndroidJUnit4::class)
class MainPozorActivityTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun check_hello_world (){
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun check_kone5(){
        onView(withText("Hello World!")).check(matches(isDisplayed()))
        onView(withText("next")).perform(click())
        onView(withText("kone5")).check(matches(isDisplayed()))

    }

}