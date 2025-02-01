package com.j8;

import java.util.stream.IntStream;

public class PaindromeChecker {
    public static boolean isPalindrome(String str){
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return IntStream.range(0, cleanStr.length() / 2).allMatch(i -> cleanStr.charAt(i) == cleanStr.charAt(cleanStr.length() - 1 - i));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}
