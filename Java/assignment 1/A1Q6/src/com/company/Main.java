package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String id, pass = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user id");
        id = sc.nextLine();

        for (int i = 2; i >= 0 ; i--) {
            if (!pass.equals("pass")){
                System.out.println("Enter password");
            pass = sc.nextLine();
            if (pass.equals("pass")) {
                System.out.println("Welcome " + id);

            } else if (i == 0) {
                System.out.println("Contact Admin");
            } else {
                System.out.println("Try again");
            }
        }
        }

    }
}
