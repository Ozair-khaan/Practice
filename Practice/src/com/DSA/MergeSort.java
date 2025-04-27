package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static <T extends Comparable<? super T>> List<T> mergeSort(List<T> list) {
        int size = list.size();
        if (size <= 1) {
            return new ArrayList<>(list);
        }

        int mid = size / 2;
        List<T> leftPart = new ArrayList<>(list.subList(0, mid));
        List<T> rightPart = new ArrayList<>(list.subList(mid, size));

        List<T> leftSorted = mergeSort(leftPart);
        List<T> rightSorted = mergeSort(rightPart);

        return merge(leftSorted, rightSorted);
    }

    private static <T extends Comparable<? super T>> List<T> merge(List<T> left, List<T> right) {
        List<T> result = new ArrayList<>(left.size() + right.size());
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        // Append any remaining elements
        while (i < left.size()) {
            result.add(left.get(i++));
        }
        while (j < right.size()) {
            result.add(right.get(j++));
        }
        return result;
    }

    public static <T extends Comparable<? super T>> boolean verifySorted(List<T> list) {
        for (int k = 1; k < list.size(); k++) {
            if (list.get(k - 1).compareTo(list.get(k)) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(54, 26, 93, 17, 77, 31, 44, 55, 20));
        System.out.println("Original:       " + myList);
        List<Integer> sortedList = mergeSort(myList);
        
        System.out.println("After mergeSort: " + sortedList);

        System.out.println("Original sorted? " + verifySorted(myList));
        System.out.println("Result sorted?   " + verifySorted(sortedList));
    }
}
