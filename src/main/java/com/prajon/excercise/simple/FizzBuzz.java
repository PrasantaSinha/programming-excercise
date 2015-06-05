package com.prajon.excercise.simple;

/**
 * Created by p.sinha on 04/06/2015.
 */
public class FizzBuzz {

    public static String[] putFizzBuzz(int[] intArray) {
        String[] fizzBuzzStringArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 15 == 0) {
                fizzBuzzStringArray[i] = "FizzBuzz";
            } else if (intArray[i] % 5 == 0) {
                fizzBuzzStringArray[i] = "Buzz";
            } else if (intArray[i] % 3 == 0) {
                fizzBuzzStringArray[i] = "Fizz";
            } else {
                fizzBuzzStringArray[i] = String.valueOf(i+1);
            }
        }

        return fizzBuzzStringArray;
    }
}
