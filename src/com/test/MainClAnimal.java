package com.test;

class Animal {
    void m1(){
        System.out.println("The animal make sound");
    }
}

class Dog extends Animal{
    void m1(){
        System.out.println("the dog is barking");
    }
}

public class MainClAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.m1();
    }
}
