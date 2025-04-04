package com.example.testingcoroutines

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations


class CalculatorWithDependencyTest {

    @Mock
    lateinit var dependency: MyDependency

    lateinit var calculatorWithDependency: CalculatorWithDependency

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        calculatorWithDependency = CalculatorWithDependency(dependency)
    }

    @Test
    fun testAdd() {
        `when`(dependency.add(2, 3)).thenReturn(5)
        val result = calculatorWithDependency.add(2, 3)
        assertEquals(5, result)
    }


}