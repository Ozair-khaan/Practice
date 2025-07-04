package com.j8;

import java.util.stream.Collectors;

public class RemoveDup {
    public static String removeDuplicate(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "java programming";
        System.out.println(removeDuplicate(str));
    }
}
