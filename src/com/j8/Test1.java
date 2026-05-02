package com.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private int id;
    private int salary;

    public Employees(int id, String name, int salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees(1, "Rohan", 10002));
        list.add(new Employees(2, "Ozair", 12100));
        list.add(new Employees(3, "Zaid", 90121));
        list.add(new Employees(4, "Sunil", 12132));
        list.add(new Employees(5, "Mehul", 90012));

        List<String> collect = list.stream()
                .filter(e -> e.getSalary() > 10000)
                .map(Employees::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

        list.parallelStream()
                .mapToDouble(Employees::getSalary)
                .average()
                .ifPresent(System.out::println);
    }
}
