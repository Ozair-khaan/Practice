package com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingClass {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(101, "Alice", 50000, "Mumbai"),
                new Employee(97, "Michel Jackson", 200000, "Argentina"),
                new Employee(100, "Charlie", 7000, "Los Angles"),
                new Employee(102, "Bob Marley", 10000, "delhi")
               );
        Collections.sort(list);

        System.out.println("Sorted by Address using (Comparable)");

        list.forEach(System.out::println);
    }

}
