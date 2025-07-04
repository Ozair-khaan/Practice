package com.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Football");
        list.add("cricket");
        list.add("volleyball");
        list.add("Baseball");
        list.add("Badminton");

        list.forEach(game-> System.out.println(game));
        //Another way to iterate...
        list.forEach(System.out::println);
        //sorting
        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}
