package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);

        Consumer<List<Integer>> iterate = a-> {a.forEach(System.out::println);};
        Thread t = new Thread(()-> iterate.accept(numList));
        t.start();
    }
}
