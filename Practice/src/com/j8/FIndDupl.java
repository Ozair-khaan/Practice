package com.j8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FIndDupl {
    public static void main(String[] args) {
        int[] num = {1, 2, 43, 5, 6, 7, 1, 2};
        Set<Integer> duplicates = Arrays.stream(num).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicates);
    }
}
