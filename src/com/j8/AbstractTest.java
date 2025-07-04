package com.j8;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("Abstract class Constructor");
    }

    abstract int add(int a, int b);

    int sub(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class AbstractTest extends AbstractClass {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest();
        int add = abstractTest.add(20, 10);
        int sub = abstractTest.sub(20, 10);
        int result = AbstractClass.multiply(10, 20);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(result);

    }
}
