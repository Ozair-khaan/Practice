package com.dlt;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateEc {
    public static void main(String[] args) {
        List<String> list = List.of("Zaid",
                "Ozair",
                "Omair",
                "Sunil",
                "Vijay");
        String startWithSpecifiedChar = list.stream()
                .filter(name -> name.startsWith("O"))
                .collect(Collectors.joining(", "));
        System.out.println(startWithSpecifiedChar);
    }
}
