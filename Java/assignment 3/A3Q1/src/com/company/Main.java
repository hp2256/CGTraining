package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person p1 = new Person(166, 75, "HP");
        Person p2 = new Person(170, 82, "person2");
        Person p3 = new Person(168, 45, "person3");
        Person p4 = new Person(186, 93, "person4");
        Person p5 = new Person(196, 93, "person5");

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);
        personArrayList.add(p4);
        personArrayList.add(p5);


        TreeSet<Person> sortedWeight = new TreeSet<>();
        for (Person p : personArrayList) {
            sortedWeight.add(p);
        }
        for (Person a : sortedWeight) {
            a.display();
        }
    }
}
