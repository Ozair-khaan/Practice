package com.j8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FDup {
    public static void main(String[] args) {
        String str = "Javav";

        Map<Character, Long> duplicateMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        duplicateMap.entrySet()
                .stream().
                filter(entry -> entry.getValue() > 1).
                forEach(entry -> System.out.println(entry.getKey()));
    }
}
