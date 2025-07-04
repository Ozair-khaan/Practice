package com.j8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";
        Character firstNonRepChar = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() == 1).
                map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("First non repeated character " + firstNonRepChar);
    }
}
