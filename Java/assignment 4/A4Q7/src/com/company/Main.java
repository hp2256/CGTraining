package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HashMap<Integer, Double> idSal = new HashMap<>();
        idSal.put(1, 20000.0);
        idSal.put(2, 23000.0);
        idSal.put(3, 123000.0);
        idSal.put(4, 1300.0);
        idSal.put(5, 320000.0);
        idSal.put(6, 1230000.0);

        StringBuilder s = new StringBuilder();
        idSal.forEach((m, n) -> s.append(m.toString()).append(n.toString()));
        System.out.println(s);
        //directly without stringbuilder:
        idSal.forEach((m, n) -> System.out.print(m.toString() + n.toString()));
    }
}
