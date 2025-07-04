package com.Stringg;


class A {
    static void m1() {
        System.out.println("Hi A");
    }
}

class B extends A {
    static void m1() {
        System.out.println("B");
    }
}

public class OverRide {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}