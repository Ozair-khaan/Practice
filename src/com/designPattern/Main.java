package com.designPattern;

public class Main {
    public static void main(String[] args) {
        EagerSingleton easy = EagerSingleton.getInstance();
        LazySingleton lazy = LazySingleton.getInstance();
        SynchronizedLazySingleton syncLazy = SynchronizedLazySingleton.getInstance();
        DoubleCheckedSingleton doubleCheked = DoubleCheckedSingleton.getInstance();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.showMessage();
        s2.showMessage();

        System.out.println("Same instance :: " + (s1 == s2));
    }
}
