package com.thread;

class ThreadEx extends Thread{
    public  void m1(){
        System.out.println("Hello, I am m1()");
    }
}

public class MyThread {
    public static void main(String[] args) {
        System.out.println("The thread is in runnable phase..");

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        thread.setName("Custom Thread");
        System.out.println(thread.getName());
        System.out.println("Thread was went to sleep for 2 sec");

        try {
            Thread.sleep(2000);
            System.out.println("Awaken after 2 sec");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ThreadEx threadEx = new ThreadEx();
        threadEx.m1();
        //threadEx.start();

    }
}
