package com.prajon.excercise.simple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Created by p.sinha on 04/06/2015.
 */
public class FizzBuzzTest {

    private int[] intArr = new int[100];

    @Before
    public void setup() {
        //do Set up
        for (int i = 0; i < 100 ; i++) {
            intArr[i] = i+1;
        }
    }

    @After
    public void tearDown() {
        //do clean up
    }

    @Test
    public void shouldPrintFizzIfIndexIsMultiplesOf3() {
        String[] fizzBuzzArray = FizzBuzz.putFizzBuzz(intArr);
        for (int i = 0; i < fizzBuzzArray.length ; i++) {
            if ((i + 1) % 15 != 0 && (i + 1) % 3 == 0)
                assertTrue("No Fizz", fizzBuzzArray[i].equals("Fizz"));
        }
    }

    @Test
    public void shouldPrintBuzzIfIndexIsMultiplesOf5() {
        String[] fizzBuzzArray = FizzBuzz.putFizzBuzz(intArr);
        for (int i = 0; i < fizzBuzzArray.length ; i++) {
            if ((i + 1) % 15 != 0 && (i + 1) % 5 == 0)
                assertTrue("No Buzz", fizzBuzzArray[i].equals("Buzz"));
        }
    }

    @Test
    public void shouldPrintFizzBuzzIfIndexIsMultiplesOf15() {
        String[] fizzBuzzArray = FizzBuzz.putFizzBuzz(intArr);
        for (int i = 0; i < fizzBuzzArray.length ; i++) {
            if ((i + 1) % 15 == 0)
                assertTrue("No FizzBuzz", fizzBuzzArray[i].equals("FizzBuzz"));
        }
    }

    @Test
    public void shouldPrintNumberNotFizzBuzzIfIndexIsNotMultipleOf3Or5Or15() {
        String[] fizzBuzzArray = FizzBuzz.putFizzBuzz(intArr);
        for (int i = 0; i < fizzBuzzArray.length ; i++) {
            if ((i + 1) % 15 != 0 && (i + 1) % 3 != 0 && (i + 1) % 5 != 0)
                assertTrue("No number", fizzBuzzArray[i].equals(String.valueOf(intArr[i])));
        }
    }
}
