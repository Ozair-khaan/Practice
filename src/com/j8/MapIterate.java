package com.j8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Java", 100);
        map.put("Spring", 200);

//        using forEach
        map.forEach((key, value)->{
            System.out.println("Key : "+key+" , Value : "+value);
        });

        //using entrySet
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Key : "+entry.getKey()+" , Value : "+entry.getValue());
        }

        //using keySet()
        for(String key: map.keySet()){
            System.out.println("Key : "+key);
        }

        //for safe removal
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() == 100) {
                System.out.println(entry.getValue() +" is successfully removed.");
                iterator.remove(); // Safe removal
            }
        }
    }
}
