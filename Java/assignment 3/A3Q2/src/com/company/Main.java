package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<String> h = new HashSet<>();
        h.add("animal");
        h.add("dragon");
        h.add("harsh");
        h.add("laptop");
        h.add("noise");
        System.out.println("Hash set is unordered: ");
        for (String a: h){
            System.out.println(a);
        }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("animal");
        lhs.add("dragon");
        lhs.add("harsh");
        lhs.add("laptop");
        lhs.add("noise");
        System.out.println("LinkedHashSet is ordered");
        for (String a: lhs){
            System.out.println(a);
        }
    }
}
