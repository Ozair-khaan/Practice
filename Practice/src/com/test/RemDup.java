package com.test;

import java.util.LinkedHashSet;

public class RemDup {
    public static void main(String[] args) {
        String str= "Programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c: str.toCharArray()){
            set.add(c);
        }
        StringBuilder builder = new StringBuilder();
        for(char ch: set){
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
