package com.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMultiplicationOfGivNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89, 20, 100, 85);
        list.stream().filter(i -> i % 5 == 0).sorted().forEach(System.out::println);

        //finding min and max value of the given list

        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("The max number is : " + max + " and the min number is : " + min);
    }
}
