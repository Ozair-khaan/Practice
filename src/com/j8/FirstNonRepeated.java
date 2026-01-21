package com.j8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input= "Swiss";
        Optional<Character> result = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if(result.isPresent()){
            System.out.println("First non-repeated character :: "+result.get());
        }
        else {
            System.out.println("No non-repeated character found");
        }
    }
}
