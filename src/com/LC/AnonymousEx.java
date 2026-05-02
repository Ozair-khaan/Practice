package com.LC;

public class AnonymousEx {
    public static void main(String[] args) {
        Runnable task = new Runnable(){

            @Override
            public void run() {
                System.out.println("Running as an anonymous class");
            }
        };
        new Thread(task).start();
    }
}
