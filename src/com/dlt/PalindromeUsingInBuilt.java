package com.dlt;

public class PalindromeUsingInBuilt {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuffer(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String checkPal= "Madam";
        boolean palindrome = isPalindrome(checkPal.toLowerCase());
        System.out.println(palindrome);
    }
}
