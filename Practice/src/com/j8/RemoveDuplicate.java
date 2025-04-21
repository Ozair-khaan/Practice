package com.j8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        String result = removeDuplicate(str);
        System.out.println(result);
    }

    public static String removeDuplicate(String input) {
        Set<Character> charSet = new LinkedHashSet<>();
        input.chars().
                mapToObj(c -> (char) c)
                .forEach(charSet::add);

        return charSet.stream()
                .map(String::valueOf).collect(Collectors.joining());

    }
}
