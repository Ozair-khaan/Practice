package com.Comp;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {

    private String name;
    private double rating;
    private int year;

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class ComparableMain {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("My name is Khan", 8.0, 2010));
        list.add(new Movie("Baahubali", 7.5, 2017));
        list.add(new Movie("Swadesh", 7.4, 2004));
        list.add(new Movie("Dil chahta hai", 7.2, 2002));
        list.add(new Movie("3 Idiots", 8.8, 2009));
        list.add(new Movie("Chennai Express", 6.4, 2013));
        list.add(new Movie("Drishyam", 7.8, 2014));

        Collections.sort(list);

        for (Movie movieList : list) {
            System.out.println(movieList.getName() + " " + movieList.getRating() + " " + movieList.getYear());
        }
    }
}
