package com.Comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies {
    private String name;
    private double rating;
    private int yaer;

    public Movies(String name, double rating, int yaer) {
        this.name = name;
        this.rating = rating;
        this.yaer = yaer;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYaer() {
        return yaer;
    }
}

class Rating implements Comparator<Movies> {

    @Override
    public int compare(Movies m1, Movies m2) {
        return Double.compare(m2.getRating(), m2.getRating());
    }
}

class NameCompare implements Comparator<Movies> {
    public int compare(Movies m1, Movies m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Movies> m = new ArrayList<>();
        m.add(new Movies("Force Awakens", 8.3, 2015));
        m.add(new Movies("Star Wars", 8.7, 1977));
        m.add(new Movies("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movies m1 : m) {
            System.out.println(m1.getRating() + " " + m1.getName() + " " + m1.getYaer());
        }

        // Sort movies by name
        Collections.sort(m, new NameCompare());
        System.out.println("\nMovies sorted by name:");
        for (Movies m1 : m) {
            System.out.println(m1.getName() + " " + m1.getRating() + " " + m1.getYaer());
        }
    }
}
