package com.myThread;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            try {
                this.c.consume_Item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);//Consumer and Producer have the sleep method but different in milliSecond
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
