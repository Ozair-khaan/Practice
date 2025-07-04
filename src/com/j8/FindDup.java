package com.j8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(arr)
                .filter(n -> !seen.add(n))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
