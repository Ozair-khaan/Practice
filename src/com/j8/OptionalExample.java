package com.j8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        String[] str = new String[10];
//        String lowercaseString = str[5].toLowerCase();
//        System.out.print(lowercaseString);

        String[] str = new String[10];
        str[5] = "Java optional class example";
        Optional<String> optionalString = Optional.ofNullable(str[5]);
        if (optionalString.isPresent()) {
            String lowerCase = str[5].toLowerCase();
            System.out.println(lowerCase);
        } else {
            System.out.println("String value is not present");
        }
    }
}
