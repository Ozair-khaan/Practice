package com.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employees {
    String name;
    String department;

    public Employees(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

public class EmployeeSorting {

    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("John", "HR"));
        employees.add(new Employees("Alice", "IT"));
        employees.add(new Employees("Bob", "Finance"));
        employees.add(new Employees("Alice", "HR"));
        employees.add(new Employees("David", "IT"));

        // Sorting by name, then by department
        employees.sort(Comparator.comparing(Employees::getName)
                .thenComparing(Employees::getDepartment));

        // Display sorted employees
        employees.forEach(System.out::println);
    }
}
