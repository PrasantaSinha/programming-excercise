package com.prajon.excercise.simple;

/**
 * Created by p.sinha on 05/06/2015.
 */
public class FibonacciNumber {

    public static int[] generateSeries(int count) {
        int[] fibonacciNumbers = new int[count];

        for (int i = 0; i < count; i++) {
            if ( i <= 1) {
                fibonacciNumbers[i] = i + 1;
            } else {
                fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
            }
        }
        return fibonacciNumbers;
    }

    public static int getSumOfEvenNumbers(int[] numberSeries) {

        int sum = 0;

        for (int i = 0; i < numberSeries.length; i++) {
            if (numberSeries[i] % 2 == 0) {
                sum += numberSeries[i];
            }
        }
        return sum;
    }
}
