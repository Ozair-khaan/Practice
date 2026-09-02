package com.dlt;

import java.util.HashSet;
import java.util.Set;

public class FindDup {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10, 50};
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!unique.add(number)) {
                duplicates.add(number);
            }
        }
        System.out.println(duplicates);
    }
}
