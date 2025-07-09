package com.designPattern;

public class EagerSingleton {
    private static final EagerSingleton instance= new EagerSingleton();

    private EagerSingleton(){
        System.out.println("EagerSingleton is created");
    }

    public static EagerSingleton getInstance(){
        return  instance;
    }
}
