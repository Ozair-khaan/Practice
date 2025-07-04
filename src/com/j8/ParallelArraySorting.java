package com.j8;

import java.util.Arrays;

public class ParallelArraySorting {
    public static void main(String[] args) {
        int[] arr = {10, 20, 12, 89, 19};
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
        Arrays.parallelSort(arr);
        System.out.println("\nElement after sorting");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
