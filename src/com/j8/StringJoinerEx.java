package com.j8;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        //StringJoiner joiner = new StringJoiner(",");
        StringJoiner joiner = new StringJoiner(",","[", "]");//delimiter , prefix, suffix
        joiner.add("Delhi");
        joiner.add("Mumbai");
        joiner.add("Lucknow");
        joiner.add("Pune");
        joiner.add("Bangalore");

        System.out.println(joiner);

        StringJoiner joinNames = new StringJoiner(",", "[", "]");
        joinNames.add("Ozair");
        joinNames.add("Umar");

        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
        joinNames2.add("Tom");
        joinNames2.add("Peter");

        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);
    }
}
