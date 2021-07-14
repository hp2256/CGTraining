package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> test1 = new HashMap<>();
        test1.put(1, 2);
        test1.put(2, 2);
        test1.put(3, 2);
        Iterator<Integer> iterator1 =test1.keySet().iterator();
        Thread t1,t2;

        t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (iterator1.hasNext()){
                    System.out.println(iterator1.next());
                }
            }
        });

        t2=new Thread(new Runnable() {
            @Override
            public void run() {
                test1.put(4,5);
            }
        });
        t1.start();
        t2.start();

        Map<Integer, Integer> test2 = new ConcurrentHashMap<>();
        test2.put(1, 2);
        test2.put(2, 2);
        test2.put(3, 2);
        Iterator<Integer> iterator2 =test2.keySet().iterator();
        Thread t3,t4;

        t3=new Thread(new Runnable() {
            @Override
            public void run() {
                while (iterator2.hasNext()){
                    System.out.println(iterator2.next());
                }
            }
        });

        t4=new Thread(new Runnable() {
            @Override
            public void run() {
                test2.put(4,5);
            }
        });
        t3.start();
        t4.start();
    }
}
