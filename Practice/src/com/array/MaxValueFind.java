package com.array;

public class MaxValueFind {
    public static void main(String[] args) {
        int[] numbers = {10, 35, 67, 2, 89, 45}; // Predefined array

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value in the array: " + max);
    }
}
