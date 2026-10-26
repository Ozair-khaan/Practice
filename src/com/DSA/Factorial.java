package com.DSA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        System.out.println(factorial);

        //finding the numbers multiplication of 5 and divide by 3
        List<Integer> listOfIntegers = Arrays.asList(445, 23, 555, 4, 5, 6, 7, 7788, 265, 875);
        List<Integer> ans = listOfIntegers.stream().filter(i -> (i % 5 == 0 && i % 3 == 0)).toList();
        System.out.println(ans);
    }
}
