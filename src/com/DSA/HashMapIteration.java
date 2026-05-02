package com.DSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        //using loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //using iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }

        //java 8 way
        map.forEach((k,v)-> System.out.println(k+"------>>>"+v));

        //Stream API
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+"-Stream API-"+e.getValue()));

        //safe removal by using iterator
       Iterator<Map.Entry<String, Integer>> it= map.entrySet().iterator();
       while (it.hasNext()){
           Map.Entry<String, Integer> entry = it.next();
           if(entry.getValue()>2){
               it.remove();
           }
       }
    }
}
