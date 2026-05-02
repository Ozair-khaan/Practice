package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class BasedOnSalary {

    public static void main(String[] args) {

    List<Employee1> employee=Arrays.asList(
            new Employee1("Aman", 15000),
            new Employee1("Rahul", 25000),
            new Employee1("Sneha", 30000),
            new Employee1("Priya", 18000),
            new Employee1("Karan", 40000)
            );
        List<String> collect = employee.stream().filter(emp -> emp.getSalary() > 20000)
                .map(Employee1::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
