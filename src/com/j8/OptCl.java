package com.j8;

import java.util.Optional;

public class OptCl {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("Hello, Optional!");
        opt.ifPresent(val-> System.out.println("Value: "+val));

        String defaultValue = opt.orElse("default value");
        System.out.println("Default value : "+defaultValue);

        opt.map(String::toUpperCase).ifPresent(val-> System.out.println("Uppercase : "+val));

        String valueOrException = opt.orElseThrow(() -> new RuntimeException("Value is missing"));
        System.out.println("Value or Exception : "+valueOrException);
    }
}
