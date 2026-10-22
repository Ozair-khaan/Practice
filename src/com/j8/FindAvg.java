package com.j8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindAvg {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: " + average);

        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("Max: " + max);

        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        boolean contains = numbers.stream().anyMatch(n -> n == 4);
        System.out.println("Contains 4 : " + contains);

        List<Integer> evenNo = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number : " + evenNo);

        List<Integer> square = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Square : " + square);

        Integer findFirst = numbers.stream().findFirst().orElse(0);
        System.out.println(findFirst);

        //Second-Largest
        Integer secLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Largest : " + secLargest);
    }
}
