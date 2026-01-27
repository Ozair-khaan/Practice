package com.test;

import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "Google";

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            if (charCount.containsKey(str.charAt(i))) {
                int count = charCount.get(str.charAt(i));
                charCount.put(currentChar, ++count);
            } else {
                charCount.put(currentChar, 1);
            }
        }
        System.out.println(charCount);
    }
}
