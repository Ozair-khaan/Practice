package com.sort;

import java.util.Arrays;
import java.util.TreeMap;

public class SortItemsByWeight {
    public static void main(String[] args) {
        String[] items = {"Laptop", "TV", "Phone", "Watch"};
        int[] weight = {500, 1000, 250, 50};

//        Item[] itemsArray = new Item[items.length];
//        for(int i=0;i<items.length;i++){
//            itemsArray[i] = new Item(items[i], weight[i]);
//        }
//
//        Arrays.sort(itemsArray, Comparator.comparingInt(Item::getWeight).reversed());
//
//        String[] sortedArray = Arrays.stream(itemsArray).map(Item::getName).toArray(String[]::new);
//
//        System.out.println(Arrays.toString(sortedArray));

        TreeMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        for (int i = 0; i < items.length; i++) {
            map.put(weight[i], items[i]);
        }

        String[] sortedArray = map.values().toArray(new String[0]);
        System.out.println(Arrays.toString(sortedArray));


    }

    static class Item {
        private final String name;
        private final int weight;

        public Item(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public String getName() {
            return name;
        }
    }
}
