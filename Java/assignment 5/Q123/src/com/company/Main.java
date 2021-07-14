package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(200, 40, "Orange", "Orange"));
        fruits.add(new Fruit(150, 80, "Apple", "Red"));
        fruits.add(new Fruit(50, 140, "Strawberry", "Red"));
        fruits.add(new Fruit(70, 500, "Grapes", "Green"));
        fruits.add(new Fruit(400, 60, "Watermelon", "Green"));

        //question 1
        System.out.println("Question 1");
        fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted((x, y) -> y.getCalories() - x.getCalories())
                .forEach(x -> System.out.println(x.getName() + " " + x.getCalories()));
        fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparing(Fruit::getCalories).reversed())
                .forEach(x -> System.out.println(x.getName() + " " + x.getCalories()));

        System.out.println();
        System.out.println("Question 2: ");
        //question 2
        fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .forEach(x -> System.out.println(x.getName() + " " + x.getColor()));

        //question 3
        System.out.println();
        System.out.println("Question 3: ");
        fruits.stream()
                .filter(x -> x.getColor().equals("Red"))
                .sorted(Comparator.comparing(Fruit::getPrice))
                .forEach(System.out::println);
    }
}
