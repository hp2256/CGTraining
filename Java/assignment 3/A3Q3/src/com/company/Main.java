package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> lhs = new ArrayList<>();
        lhs.add("animal");
        lhs.add("dragon");
        lhs.add("harsh");
        lhs.add("laptop");
        lhs.add("noise");
        ListIterator<String> i = lhs.listIterator(lhs.size());
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}
