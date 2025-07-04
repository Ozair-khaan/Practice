package com.array;

import java.util.Arrays;

public class ArrayMerger {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = arr2[i];
        }

        return mergedArray;
    }
}
