package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface Java8Example {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from a lambda expression");
        new Thread(runnable).start();

        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "apple");
        List<String> longWords = words.stream().filter(word -> word.length() > 5).collect(Collectors.toList());
        System.out.println("Long words: " + longWords);

        List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Upper Case words: " + upperCase);

        List<String> removedDuplicate = words.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicate removed : " + removedDuplicate);

        List<String> sorted = words.stream().sorted().collect(Collectors.toList());
        System.out.println("In sorted : " + sorted);

        words.forEach(word -> System.out.println("Using forEach: " + word));

        words.stream().forEach(word -> System.out.println("Using forEach with stream: " + word));

        Optional<String> combinedWord = words.stream().reduce((word1, word2) -> word1 + "," + word2);
        combinedWord.ifPresent(result -> System.out.println("Combined words : " + result));

        String nullableString = null;
        Optional<String> optionalString = Optional.ofNullable(nullableString);

        if (optionalString.isPresent()) {
            System.out.println("String value: " + optionalString);
        } else {
            System.out.println("String is null");
        }

        String result = optionalString.orElse("Default Value:");
        System.out.println("Result: " + result);

        List<String> mixedCaseWord = Arrays.asList("apple", "banana", "orange", "kiwi");
        List<String> sortedIgnoreCaseWords = mixedCaseWord.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println("Sorted (ignore case): " + sortedIgnoreCaseWords);


        long parallelCount = words.parallelStream().count();
        System.out.println("Parallel stream word count : " + parallelCount);

    }
}
