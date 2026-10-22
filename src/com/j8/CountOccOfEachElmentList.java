package com.j8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccOfEachElmentList {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "orange");
        Map<String, Long> countEachElement = words.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Word Counts : " + countEachElement);
    }
}
