package com.j8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> merged = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println("Merged List : " + merged);
    }
}
