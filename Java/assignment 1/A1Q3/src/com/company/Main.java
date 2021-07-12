package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double p,si,compint,r;
        int t,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter initial principle balance");
        p=sc.nextDouble();
        System.out.println("Enter annual interest rate percent");
        r=sc.nextDouble();
        r=r/100;
        System.out.println("Enter time in years");
        t=sc.nextInt();
        System.out.println("Enter number of times interest applied per time period");
        n=sc.nextInt();

        si=p*(1+(r*t));

        compint=p*Math.pow(((1+(r/n))),(n*t));

        System.out.println("Total is:  " +si +" Simple interest is :" + (si-p));
        System.out.println("Total is: " + (compint) + " Comp interest is: " + (compint-p));

    }
}
