package com.prajon.excercise.simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by p.sinha on 05/06/2015.
 */
public class FibonacciNumberTest {

    @Before
    public void setup() {
        // do setup
    }

    @After
    public void tearDown() {
        // Clean up
    }

    @Test
    public void shouldGenerateFibonacciNumbersUpto10Term() {
        int[] fibonacci = FibonacciNumber.generateSeries(10);
        for (int i = fibonacci.length - 1; i > 1 ; i--) {
            assertTrue("Not a Fibonacci", fibonacci[i - 2] == fibonacci[i] - fibonacci[i - 1] );
        }

    }

    @Test
    public void shouldSum1st10EvenFibonacciNumbers() {
        int sum = FibonacciNumber.getSumOfEvenNumbers(FibonacciNumber.generateSeries(10));

        assertEquals("Incorrect sum", 44, sum);
    }
}
