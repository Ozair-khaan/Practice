package com.LC;

public class DatabaseConnection {

    // 1. Private constructor prevents instantiation from other classes
    private DatabaseConnection() {}

    // 2. Private static inner class (lazy-loaded only when requested)
    private static class SingletonHolder {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    // 3. Public global access point
    public static DatabaseConnection getInstance() {
        System.out.println("returning instance  :: "+SingletonHolder.INSTANCE);
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        getInstance();
    }
}