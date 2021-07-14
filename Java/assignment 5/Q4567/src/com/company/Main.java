package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(1, "HP", "ABC", "hi hello"));
        newsList.add(new News(1, "HP", "XYZ", "hi hello hey budget"));
        newsList.add(new News(1, "HP", "LMN", "hi hello"));
        newsList.add(new News(2, "HP", "ABC", "hi hello"));
        newsList.add(new News(3, "HP", "ABC", "hi hello"));
        newsList.add(new News(4, "HP", "ABC", "hi hello budget"));
        newsList.add(new News(5, "HP", "ABC", "budget"));
        newsList.add(new News(5, "JAK", "BAK", "budget"));

        newsList.add(new News(1, "HP", "ABC", "hi hello"));
        newsList.add(new News(1, "HP", "ABC", "hi hello"));

        //question 4
        Map<Integer,Long> idCount =
                newsList.stream()
                .collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));

        System.out.println("new id with max comments: "+
                idCount.entrySet().stream()

                        .max((id1,id2)-> (int) (id1.getValue()-id1.getValue())).get().getKey());


        //question 5
        System.out.println("\nQuestion 5 ");
        int budgetCount = (int) newsList.stream()
                .filter(x -> x.getComment().contains("budget"))
                .count();
        System.out.println(budgetCount);

        //question 6
        System.out.println("\nQuestion 6");
        Map<String, Long> userCount =
                newsList.stream()
                .collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));



        System.out.println("User "+userCount.entrySet()
                .stream()
                .max((a1,a2)-> (int) (a1.getValue()-a2.getValue()))
                .get().getKey()+" has most comments");

        //question 7
        System.out.println("\nQuestion 7");

        for (Map.Entry<String,Long> user: userCount.entrySet()){
            System.out.println("User "+ user.getKey()+ " Number of comments: "+ user.getValue());
        }

    }
}
