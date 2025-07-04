package com.j8;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 3, 6, 7, 8, 9,11);
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers : "+sum);
    }
}
