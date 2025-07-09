package com.designPattern;

public class Main {
    public static void main(String[] args) {
        EagerSingleton easy = EagerSingleton.getInstance();
        LazySingleton lazy = LazySingleton.getInstance();
        SynchronizedLazySingleton syncLazy = SynchronizedLazySingleton.getInstance();
        DoubleCheckedSingleton doubleCheked = DoubleCheckedSingleton.getInstance();
    }
}
