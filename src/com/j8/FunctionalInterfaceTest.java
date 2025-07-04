package com.j8;

@FunctionalInterface
interface TestInterface{
    void say(String msg);
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class FunctionalInterfaceTest implements TestInterface{

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceTest functionalInterface = new FunctionalInterfaceTest();
        functionalInterface.say("Hello! Tom");
    }
}
