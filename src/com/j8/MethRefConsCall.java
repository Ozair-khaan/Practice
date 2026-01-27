package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethRefConsCall {
    public MethRefConsCall() {
        System.out.println("Constructor is being called");
    }

    public static void main(String[] args) {
        Supplier<MethRefConsCall> ref = MethRefConsCall::new;
        ref.get();

        //to iterate an array

        List<String> list = Arrays.asList("Tom", "Charlie", "Steve", "Batman");
        System.out.println("List calling");
        list.forEach(System.out::println);
    }
}
