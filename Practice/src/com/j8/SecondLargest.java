package com.j8;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        System.out.println("Largest: " + largest + ", Second: " + second);
    }
}
