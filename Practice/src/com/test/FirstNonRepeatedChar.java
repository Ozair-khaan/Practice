package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input="swiss";

        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for(char ch : input.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        Character result = hashMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("First non-repeated character : "+(result!=null?result:"None"));
    }
}
