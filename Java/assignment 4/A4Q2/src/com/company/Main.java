package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Orders> ordersList = new ArrayList<>();
        ordersList.add(new Orders(1, 12000, "COMPLETED"));
        ordersList.add(new Orders(2, 9000, "COMPLETED"));
        ordersList.add(new Orders(3, 22000, "ACCEPTED"));
        ordersList.add(new Orders(4, 2000, "ACCEPTED"));
        ordersList.add(new Orders(5, 1000, "COMPLETED"));
        ordersList.add(new Orders(6, 122000, "COMPLETED"));
        ordersList.add(new Orders(7, 112000, "PENDING"));
        ordersList.add(new Orders(8, 5000, "PENDING"));
        PriceMoreThan10 checkPrice = (a) -> {
            if (a.price > 10000 && a.status.equals("COMPLETED") || a.status.equals("ACCEPTED"))
                return true;
            else
                return false;
        };

        for (Orders a : ordersList) {
           if (checkPrice.priceMoreThan10(a)) System.out.println(a);
        }

    }
}

@FunctionalInterface
interface PriceMoreThan10 {
    boolean priceMoreThan10(Orders a);
}