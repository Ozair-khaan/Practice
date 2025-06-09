package com.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWithSymbol {
    public static void main(String[] args) {
        List<String> socialMed = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedStr = socialMed.stream().collect(Collectors.joining(", ", "[", "]")); //[val1, val2....]
        System.out.println(joinedStr);

    }

}
