package com.example.androidtestingproject.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class HelperTest {
    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper = Helper()
        println("Before Every Test Case")
    }

    @Test
    fun isPalindrome_inputString_hello_expected_false() {
        //Act
        val result = helper.isPalindrome("hello")

        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_level_expected_true() {
        //Act
        val result = helper.isPalindrome("level")

        //Assert
        assertEquals(true, result)
    }

    @After
    fun tearDown(){
        println("After every test case")
    }
}