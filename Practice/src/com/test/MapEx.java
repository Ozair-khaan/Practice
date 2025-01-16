package com.test;

import java.util.concurrent.ConcurrentHashMap;

public class MapEx {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A",1);
        concurrentHashMap.put("B",2);
        concurrentHashMap.put("C",3);

        System.out.println("Map size: "+concurrentHashMap.size());

        Integer valueOfA = concurrentHashMap.get("A");
        System.out.println("Value of A : "+valueOfA);

        concurrentHashMap.remove("B");
        System.out.println("Map size : "+concurrentHashMap.size());

    }
}
