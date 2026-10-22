package com.j8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class GrpByObject {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 30),
                new Person("Ozair", 25),
                new Person("Sunil", 30)
        );
        Map<Integer, List<Person>> groupByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("Grouped by age "+groupByAge);

    }
}
