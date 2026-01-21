package com.designPattern;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private static volatile Singleton instance;

    public Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed");
    }

    public void showMessage() {
        System.out.println("Singleton instance hashCode : " + this.hashCode());
    }
}
