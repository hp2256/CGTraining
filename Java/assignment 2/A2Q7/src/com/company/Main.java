package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String role,prod,prodowner;
        int amt,items;
        int candytotal=40,cookietotal=50,ictotal=60;
        Double total;
        int totalitems;
        Scanner sc= new Scanner(System.in);
        System.out.println("Are you customer or owner?");
        role=sc.nextLine();
        switch (role){
            case "owner"->{
                System.out.println("Add items to storage, select Cookie, Candy, or Ice Cream");

                prodowner = sc.nextLine();
                switch (prodowner) {
                    case "Candy" -> {
                        System.out.println("Enter amount of candies: ");
                        items = sc.nextInt();
                        totalitems=items+candytotal;
                        System.out.println("Total candies are: " + totalitems);
                    }
                    case "Cookie" -> {
                        System.out.println("Enter amount of cookies: ");
                        items = sc.nextInt();
                        totalitems=items+cookietotal;
                        System.out.println("Total cookies are: " + totalitems);
                    }
                    case "Ice Cream" -> {
                        System.out.println("Enter amount of ice creams: ");
                        items = sc.nextInt();
                        totalitems=items+ictotal;
                        System.out.println("Total icecreams are: " + totalitems);

                    }
                    default -> System.out.println("Invalid input enter Candy, Cookie, or Ice Cream");
                }
            }
            case "customer"-> {
                System.out.println("Enter product Candy, IceCream or Cookie");
                prod = sc.nextLine();
                switch (prod) {
                    case "Candy" -> {
                        DessertItem candy = new Candy();
                        System.out.println("Enter amount of candies: ");
                        amt = sc.nextInt();
                        total = (double) (candy.getCost() * amt * 60);
                        System.out.println("Total cost is: " + total);
                    }
                    case "Cookie" -> {
                        DessertItem cookie = new Cookie();
                        System.out.println("Enter amount of cookies: ");
                        amt = sc.nextInt();
                        total = (double) (cookie.getCost() * amt * 70);
                        System.out.println("Total cost is: " + total);
                    }
                    case "Ice Cream" -> {
                        DessertItem ic = new IceCream();
                        System.out.println("Enter amount of ice creams: ");
                        amt = sc.nextInt();
                        total = (double) (ic.getCost() * amt);
                        System.out.println("Total cost is: " + total);
                    }
                    default -> System.out.println("Invalid input enter Candy, Cookie, or Ice Cream");
                }
            }
            default-> {
                System.out.println("Error enter customer or owner");
            }
        }
    }
}
