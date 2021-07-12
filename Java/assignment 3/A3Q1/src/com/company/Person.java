package com.company;

public class Person implements Comparable<Person>{

    int height, weight;
    String name;

    public Person(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    void display(){
        System.out.println("Person "+ this.name+ " weight: " + this.weight+ " height: "  + this.height);
    }

    @Override
    public int compareTo(Person o) {
        if (this.weight==o.weight){
         if (this.height>o.height){
             return 1;
         }
            return 0;
        }
        else if (this.weight>o.weight)
        return 1;
        else return -1;
    }
}
