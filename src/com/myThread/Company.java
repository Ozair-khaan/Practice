package com.myThread;

public class Company {
    int n;
    boolean f = false;

    //f=false :chance : producer
    //f=true : chance : consumer
    synchronized public void produce_Item(int n) throws InterruptedException {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_Item() throws InterruptedException {
        if (!f) {
            wait();
        }
        System.out.println("Consume : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
