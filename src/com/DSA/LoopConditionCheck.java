package com.DSA;

public class LoopConditionCheck {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i = i + 2) {
            System.out.println(i);
        }
        //another condition
        int p = 0;
        for (int i = 1; p <= n; i++) {
            p += i;
            System.out.println(p);
        }
    }
}
