package com.test;

import java.util.HashMap;
import java.util.Map;

public class FIndHighestOcc {

    public static void main(String[] args) {
        String input = "programming";
        findUniqueCharacter(input);
    }

    public static void findUniqueCharacter(String input) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;


        System.out.println("Unique Character");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
                //System.out.println(entry.getKey());
            }
        }
        System.out.println(maxChar + " " + maxCount);
    }

}
