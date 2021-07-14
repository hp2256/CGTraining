package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Trader> traders = new ArrayList<>();
        Trader t1= new Trader("Harsh", "Mumbai");
        Trader t2=new Trader("Patel", "Bangalore");
        Trader t3 = new Trader("Cheeto", "Chennai");
        Trader t4= new Trader("Jay", "Delhi");
        Trader t5= new Trader("Lays", "Pune");
        Trader t6 = new Trader("Jack", "Pune");
        Trader t7 = new Trader("Zack", "Pune");
        Trader t8 = new Trader("Array", "Pune");
        traders.add(t1);
        traders.add(t2);
        traders.add(t3);
        traders.add(t4);
        traders.add(t5);
        traders.add(t6);
        traders.add(t7);
        traders.add(t8);

        List <Transaction> transactions= new ArrayList<>();
        transactions.add(new Transaction(t1,2011,10000));
        transactions.add(new Transaction(t4,2011,12000));
        transactions.add(new Transaction(t4,2012,20000));
        transactions.add(new Transaction(t2,2014,14000));
        transactions.add(new Transaction(t5,2015,32000));
        transactions.add(new Transaction(t3,2016,4000));
        transactions.add(new Transaction(t6,2012,52000));

        //question 8
        System.out.println("Question 8");
        transactions.stream()
                .filter(yr-> yr.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        //question 9
        System.out.println("Question 9");
        traders.stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        //question 10
        System.out.println("Question 10");
        traders.stream()
                .filter(city -> city.getCity().equals("Pune"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //question 11
        System.out.println("Question 11");
        StringBuilder s = new StringBuilder();
        traders.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(x -> {
                    s.append(x.getName());
                });
        System.out.println(s);

        //question 12
        System.out.println("Question 12");
       boolean indoreTraders= traders.stream()
                .anyMatch(tradercity -> tradercity.getCity().equals("Indore"));
        System.out.println("Are any traders based in Indore: " + indoreTraders);

        //question 13
        System.out.println("Question 13");
        transactions.stream()
                .filter(tdcity-> tdcity.getTrader().getCity().equals("Delhi"))
                .forEach(transaction -> System.out.println(transaction.getValue()));

        //question 14
        System.out.println("Question 14");
       Transaction max= transactions.stream().max(Comparator.comparing(Transaction::getValue)).get();
        System.out.println(max.getValue());
        System.out.println(transactions.stream()
                .max(Comparator.comparing(Transaction::getValue)));

        //question 15
        System.out.println("Question 15");
        Transaction min= transactions.stream().min(Comparator.comparing(Transaction::getValue)).get();
        System.out.println(min.getValue());
        System.out.println(transactions.stream()
                .min(Comparator.comparing(Transaction::getValue)));




    }
}
