package com.j8;

import java.util.Comparator;
import java.util.function.BiFunction;

class Addition {
    public int add(int a, int b){
        return a+b;
    }
}

public class Arithmetic{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> obj = new Addition()::add;
        Integer apply = obj.apply(10, 20);
        System.out.println(apply);
    }
}
