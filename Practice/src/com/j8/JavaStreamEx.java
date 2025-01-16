package com.j8;

import java.util.stream.Stream;

public class JavaStreamEx {
    public static void main(String[] args) {
        Stream.iterate(1, element -> element + 1).filter(elements -> elements % 5 == 0).limit(10).forEach(System.out::println);
    }
}
