package com.j8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class FindMaxSal {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Alice", 15000),
                new Employee("Bob", 25000),
                new Employee("Charlie", 30000),
                new Employee("David", 18000),
                new Employee("Eve", 45000)
        ));

        employees.add(new Employee("Ozair", 22000));
        List<String> highEarnerNames = employees.stream().filter(emp -> emp.getSalary() > 20000).map(Employee::getName).collect(Collectors.toList());
        System.out.println("employees earning 20000 : " + highEarnerNames);
    }
}
