package com.test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String str = "Ehtesham";
        // int count=0;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            //   count++;
        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            // if (m.getValue() > 1) {  //to find duplicate condition
            System.out.println(m.getKey() + " : " + m.getValue());
            //  }
        }
    }
}
