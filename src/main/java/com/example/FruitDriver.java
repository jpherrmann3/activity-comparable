package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class FruitDriver {
    public static void main( String[] args ) {
        Fruit apple100 = new Fruit("Apple", 100);
        Fruit orange = new Fruit("Orange", 7);
        Fruit peach = new Fruit("Peach", 12);
        Fruit banana = new Fruit("Banana", 257);
        Fruit tangerine = new Fruit("Tangerine", 11);
        Fruit apple50 = new Fruit("Apple", 50);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple100);
        fruits.add(apple50);
        fruits.add(orange);
        fruits.add(peach);
        fruits.add(banana);
        fruits.add(tangerine);

        fruits.forEach(System.out::println);
        System.out.println();

        Collections.sort(fruits);
        fruits.forEach(System.out::println);
        System.out.println();

        Collections.reverse(fruits);
        fruits.forEach(System.out::println);
        System.out.println();

    }
}
