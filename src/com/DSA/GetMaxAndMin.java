package com.DSA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetMaxAndMin {
    public static void getThreeMaxMin(List<Integer> list) {
        System.out.println("First three max numbers");
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        System.out.println("First three min numbers");
        list.stream().sorted().limit(3).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 231, 23, 122, 34, 2, 44, 3435, 1232, 434, 234, 2, 24234, 232, 2423423);
        getThreeMaxMin(list);
    }
}
