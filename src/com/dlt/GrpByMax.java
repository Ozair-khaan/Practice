package com.dlt;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String dept;
    private int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }
}

public class GrpByMax {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "IT", 70000),
                new Employee("Alice", "HR", 80000),
                new Employee("Bob", "IT", 90000),
                new Employee("David", "HR", 75000),
                new Employee("Mike", "Finance", 100000)
        );
        Map<String, Employee> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        //Collectors.maxBy(Comparator.comparing(Employee::getSal))
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparing(Employee::getSal)
                                ),
                                Optional::get
                        )
                ));
        System.out.println("Max salary group :: " + result);
    }
}
