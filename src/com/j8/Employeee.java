package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employe{
    private String name;
    private String depatment;
    private double salary;

    public Employe(String name, String depatment, double salary) {
        this.name = name;
        this.depatment = depatment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepatment() {
        return depatment;
    }

    public double getSalary() {
        return salary;
    }
}

public class Employeee{
    public static void main(String[] args) {
        List<Employe> employee = Arrays.asList(
                new Employe("Amit", "IT", 90000),
                new Employe("Vikram", "HR", 60000),
                new Employe("Neha", "IT", 110000),
                new Employe("Rahul", "Finance", 85000));

        Map<String, List<String>> highestEarnersByDept = employee.stream()
                .filter(emp -> emp.getSalary() > 70000)
                .collect(Collectors.groupingBy(
                        Employe::getDepatment,
                        Collectors.mapping(Employe::getName, Collectors.toList())
                ));

        System.out.println(highestEarnersByDept);
    }
}
