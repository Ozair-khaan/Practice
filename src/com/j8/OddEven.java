package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(95, 14, 56, 87, 71, 18, 42, 21, 67, 78, 12);
        Map<Boolean, List<Integer>> oddEvenNo = listOfInteger.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Map.Entry<Boolean, List<Integer>>> entries = oddEvenNo.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry : entries) {
            System.out.println("---------");
            if (entry.getKey()) {
                System.out.println("even no");
            } else {
                System.out.println("Odd no");
            }
            System.out.println("--------");

            List<Integer> list = entry.getValue();
            for (int i : list) {
                System.out.println(i);
            }
        }

    }
}
