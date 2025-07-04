package com.DSA;

public class RecursionOnFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 3 is : " + fact(3));
        System.out.println("Factorial of 10 is : " + fact(10));
        System.out.println("Factorial of 15 is : " + fact(15));
    }

    static int fact(int n) {
        int result;

        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}
