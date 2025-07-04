package com.j8;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
        System.out.println(num + " is prime : " + isPrime);
    }
}
