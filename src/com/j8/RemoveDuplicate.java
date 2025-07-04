package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueString = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueString);

        //printing only the non-duplicate string value

        Map<String, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(s -> s,
                Collectors.counting()));
        List<String> nonDupStr = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).collect((Collectors.toList()));
        System.out.println(nonDupStr);


    }
}
