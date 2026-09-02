package com.dlt;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static Character firstNonRepeating(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str= "kkhaan";
        System.out.println(firstNonRepeating(str));
    }
}
