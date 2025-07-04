package com.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class SortingEx {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101, "Dell", 29000f));
        products.add(new Product(102, "HP", 25000f));
        products.add(new Product(104, "Apple", 50000f));
        products.add(new Product(106, "Lenovo", 32000f));
        products.add(new Product(108, "Asus", 32000f));

        //earlier way
        ArrayList<Float> filterProd = new ArrayList<>();

        for (Product product : products) {
            if (product.price > 30000) {
                filterProd.add(product.price);
            }
        }
        System.out.println(filterProd);

        //using map for iteration
        List<Float> collect = products.stream().filter(p -> p.price > 30000).map(p -> p.price).collect(Collectors.toList());
        System.out.println("Using map : "+collect);

        //using forEach
        products.stream().filter(prod->prod.price==30000).forEach(product -> System.out.println("Using forEach : "+product.name));

        //using reduce
        Float reduce = products.stream().map(prod -> prod.price).reduce(0.0f, Float::sum);//reduce is using to get the sum of price
        System.out.println("Using reduce : "+reduce);

        //Sum by Using Collectors Methods
        Double collect1 = products.stream().collect(Collectors.summingDouble(product -> product.price));
        System.out.println("Sum by Using Collectors Methods : "+collect1);

        //Max Product Price
        Product productA = products.stream().max((products1, products2) -> products1.price > products2.price ? 1 : -1).get();
        System.out.println("Max product price : "+productA.price);

        //Min Product price
        Product productB = products.stream().min((products1, products2) -> products1.price > products2.price ? 1 : -1).get();
        System.out.println("Max product price : "+productB.price);

        //using count
        long count = products.stream().filter(product -> product.price < 30000).count();
        System.out.println("Count on the basis of given condition : "+count);

        //converting list into set
        Set<Float> listIntoSet = products.stream().filter(product -> product.price > 30000).map(product -> product.price).collect(Collectors.toSet());
        System.out.println("Converted list into set "+listIntoSet);

        //converting list into map
        Map<Integer, String> listToMap = products.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
        System.out.println("Converted list into map "+listToMap);

    }
}
