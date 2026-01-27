package com.j8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 7, 1, 9, 8};
        int[] b = new int[]{8, 3, 9, 5, 4, 10};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        //without duplicate

        System.out.println("without duplicate");
        int[] d = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(d));
    }
}
