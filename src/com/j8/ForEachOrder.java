package com.j8;

<<<<<<< HEAD
import java.util.*;
=======
import java.util.ArrayList;
>>>>>>> ad79a38 (ImpQues)

public class ForEachOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Sonmarg");
        list.add("Munnar");
        list.add("Goa");
        list.add("Himachal");
        list.add("Jaipur");

        list.stream().forEachOrdered(places-> System.out.println(places));
        list.stream().forEachOrdered(System.out::println);

    }
}
