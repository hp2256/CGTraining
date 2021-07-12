package com.company;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x=20;
        Consumer p = (a)-> System.out.println(a);
        p.accept(x);

        Supplier s = ()->Math.random();
        System.out.println(s.get());

        Predicate<Integer> pred= i->(i>10000);
        System.out.println(pred.test(20000));

        Function<Double,Double> doubleValue = a->2*a;
        System.out.println("Doubling a value "+x +": " + doubleValue.apply((double) x));

    }
}
