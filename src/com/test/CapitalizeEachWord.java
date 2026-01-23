package com.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        String s = "the sun rise on the east";
        String result = Arrays.stream(s.split(" "))
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(result);

        String s1 = "AAABBDDACCC";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s1.length(); i++) {
            if (i == s1.length() || s1.charAt(i) != s1.charAt(i - 1)) {
                sb.append(count).append(s1.charAt(i - 1));
                count = 1;
            } else count++;
        }
        System.out.println("Counting every character :: " + sb);
    }
}
