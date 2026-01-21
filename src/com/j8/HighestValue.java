package com.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestValue {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(100, 200, 300, 400, 500, 150, 50);
        List<Integer> highPrice = prices.stream().filter(p -> p > 200).collect(Collectors.toList());
        System.out.println(highPrice);

        //reverse sorted

        List<Integer> reverseOrder = prices.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);

        //aggregation
        Integer sum = prices.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //all in one

        double totalTaxedValue = prices.stream()
                .filter(p -> p > 100)        // 1. Filter: Keep only prices > 100
                .map(p -> p * 1.10)          // 2. Map: Add 10% tax
                .sorted()                    // 3. Sort: Order them (optional here but good for display)
                .reduce(0.0, Double::sum);   // 4. Reduce: Sum them up

        System.out.println("Total Calculation: " + totalTaxedValue);

        //debugging
        List<Integer> result = prices.stream()
                .peek(n -> System.out.println("Original: " + n)) // See what comes in
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After Filter: " + n)) // See what passed the filter
                .map(n -> n * 10)
                .peek(n -> System.out.println("After Map: " + n)) // See the transformed value
                .collect(Collectors.toList());
    }
}
