package com.company;

import java.util.Comparator;

public class Fruit {
    int calories,price;
    String name,color;

    public Fruit(int calories, int price, String name, String color) {
        this.calories = calories;
        this.price = price;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "calories=" + calories +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
