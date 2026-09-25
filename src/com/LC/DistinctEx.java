package com.LC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 7, 9, 5, 12, 3, 8);
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Greater than five " + count);
        List<Integer> uniqueNo = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique " + uniqueNo);
    }
}
