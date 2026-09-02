package com.LC;

public class SHSal {
    public static int secondHighestSal(int[] salaries) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int salary : salaries) {
            if (salary > highest) {
                secondHighest = highest;
                highest = salary;
            } else if (salary > secondHighest && salary != highest) {
                secondHighest = salary;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] salaries = {9000, 1000, 2000, 15000, 15000, 24000};
        int secondHighestSal = secondHighestSal(salaries);
        System.out.println(secondHighestSal);
    }
}
