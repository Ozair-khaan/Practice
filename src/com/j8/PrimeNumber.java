package com.j8;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<Integer> collect = Arrays.stream(arr)
                .filter(PrimeNumber::isPrime)
                .boxed()
                .sorted()
                .toList();
        System.out.println("Prime Number :: " + collect);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i < number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
