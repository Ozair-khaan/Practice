package com.recursion;

public class RecursionDemo {

    // Recursive function to calculate the sum of first 'n' natural numbers
    public static int sum(int n) {
        // Base case: If n is 0, return 0 (base case)
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1); // Recursive case: If n is not 0, recursively call the sum function with n-1 and add it to n
    }
}

class Test {
    public static void main(String[] args) {
        int num = 5; // Number of natural numbers to sum
        // Calculate sum of first 'num' natural numbers using recursive sum function
        int result = RecursionDemo.sum(num);
        // Print the result
        System.out.println("Sum of first " + num + " natural numbers is: " + result);
    }

}
