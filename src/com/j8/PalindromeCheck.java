package com.j8;

import java.util.stream.IntStream;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
