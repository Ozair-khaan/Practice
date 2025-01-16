package com;

import java.util.HashMap;
import java.util.Map;

public class ChKon {
    public static void main(String[] args) {
        String str="aeroplane";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c: str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
