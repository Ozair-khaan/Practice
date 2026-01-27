package com.j8;

public class InstanceMeth {
    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMeth()::printMsg);
        thread.start();
    }

    public void printMsg() {
        System.out.println("Hello, This is instance meth");
    }
}
