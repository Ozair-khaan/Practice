package com.j8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighest {
    public static Optional<Integer> findSecondHighest(int[] nums) {
        return Arrays.stream(nums).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    public static void main(String[] args) {
        int arr[] = {100, 200, 564, 789, 56542, 1342};
        Optional<Integer> secondHighest = findSecondHighest(arr);
        secondHighest.ifPresent(System.out::println);
    }
}
