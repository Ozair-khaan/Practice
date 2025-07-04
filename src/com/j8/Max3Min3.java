package com.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max3Min3 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("-------------------------");

        System.out.println("Min 3 numbers");

        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        //max 3
        System.out.println("--------------------------");
        System.out.println("max 3 numbers");

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
