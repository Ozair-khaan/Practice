package com.DSA;

import java.util.function.IntFunction;

public class BaseValueSolver {
    public static int findBaseValue(IntFunction<Double> f, IntFunction<Double> g, double c, boolean isBigO) {
        int n = 1;
        while (n < Integer.MAX_VALUE) {
            double left = f.apply(n);
            double right = c * g.apply(n);
            if ((isBigO && left <= right) || (!isBigO && left >= right)) {
                return n;
            }
            n++;
        }
        return -1;
    }

    public static void main(String[] args) {
        IntFunction<Double> f = n -> 5.0 * n + 3;
        IntFunction<Double> g = n -> (double) n;

        double c = 6.0;

        int baseForBigO = findBaseValue(f, g, c, true);
        int baseForBigOmega = findBaseValue(f, g, c, false);

        System.out.println("Base n₀ for Big-O: " + baseForBigO);
        System.out.println("Base n₀ for Big-Omega: " + baseForBigOmega);
    }
}
