package com.j8;

public class InstanceMeth {
    public void printMsg(){
        System.out.println("Hello, This is instance meth");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMeth()::printMsg);
        thread.start();
    }
}
