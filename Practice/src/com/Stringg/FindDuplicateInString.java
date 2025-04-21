package com.Stringg;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInString {
    public static void main(String[] args) {
        String str="Javav";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch :str.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer>map : hashMap.entrySet()){
            if(map.getValue()>1){
                System.out.print(map.getKey());
            }

        }
    }
}
