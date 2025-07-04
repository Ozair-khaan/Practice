package com.j8;


@FunctionalInterface
interface ArithmeticOperation {
    double operate(double a, double b);
}

public class Calculator {
    public static void main(String[] args) {
        ArithmeticOperation add = (a, b) -> a + b;
        ArithmeticOperation subtract = (a, b) -> a - b;
        ArithmeticOperation multiply = (a, b) -> a * b;
        ArithmeticOperation divide = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Connot divide with zero");
            }
            return a / b;
        };

        System.out.println(add.operate(5, 3));
        System.out.println(divide.operate(10, 4));
    }
}
