package com.prajon.excercise.simple;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by p.sinha on 05/06/2015.
 */
public class MultipleOf3And5Test {


    @Before
    public void setup() {
        //do Set up
    }

    @After
    public void tearDown() {
        //do clean up
    }

    @Test
    public void shouldAddMultipleOf3And5For1to9() {

        int[] intArr = getRealNumbers(9);
        int sum = MultipleOf3And5.add(intArr);

        assertEquals("Sum dont match", 23, sum);

    }

    @Test
    public void shouldAddMultipleOf3And5For1to99() {
        int[] intArr = getRealNumbers(99);
        int sum = MultipleOf3And5.add(intArr);

        assertEquals("Sum dont match", 2318, sum);

    }

    private int[] getRealNumbers(int upto) {
        int[] intArr = new int[upto];
        for (int i = 0; i < upto ; i++) {
            intArr[i] = i+1;
        }

        return intArr;
    }
}
