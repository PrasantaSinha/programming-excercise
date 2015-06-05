package com.prajon.excercise.simple;

/**
 * Created by p.sinha on 05/06/2015.
 */
public class MultipleOf3And5 {

    public static int add(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 3 == 0 || intArray[i] % 5 == 0 ) {
                sum += intArray[i];
            }
        }
        return sum;
    }
}
