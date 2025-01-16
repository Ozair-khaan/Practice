package com.constructor;

public class ConsChaining {

    private String name;
    private int age;
    private String depart;

    ConsChaining(){
        this("Akbar",28, "Development");
    }

    public ConsChaining(String name, int age) {
        this(name, age, "Unknown");
    }

    public ConsChaining(String name, int age, String depart) {
        this.age = age;
        this.name = name;
        this.depart = depart;
    }

    public void display(){
        System.out.println("Name : "+name+", Age : "+age+", Department : "+depart);
    }

    public static void main(String[] args) {
        ConsChaining chaining = new ConsChaining();
        chaining.display();

        ConsChaining chaining1 = new ConsChaining("Amar",26);
        chaining1.display();

        ConsChaining chaining2 = new ConsChaining("Anthony", 24, "General");
        chaining2.display();
    }
}
