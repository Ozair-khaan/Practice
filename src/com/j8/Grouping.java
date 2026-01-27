package com.j8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Sales", "Manager", "Alice"),
                new Employee("Sales", "Representative", "Bob"),
                new Employee("Marketing", "Manager", "Charlie"),
                new Employee("Sales", "Manager", "David")
        );

        Map<String, Map<String, List<Employee>>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getRole)));

        System.out.println(grouped);
    }

    static class Employee {
        String department;
        String role;
        String name;

        public Employee(String department, String role, String name) {
            this.department = department;
            this.role = role;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "department='" + department + '\'' +
                    ", role='" + role + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}