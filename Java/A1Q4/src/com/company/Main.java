package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double marks1,marks2,marks3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        marks1=sc.nextDouble();
        System.out.println("Enter subject 2 marks");
        marks2=sc.nextDouble();
        System.out.println("Enter subject 3 marks");
        marks3=sc.nextDouble();
        if (marks1>=60 && marks2>=60 && marks3>=60){
            System.out.println("Passed");
        }
        else if (marks1>=60 && marks2>=60 || marks2>=60 && marks3>=60 ||marks1>=60 && marks3>=60){
            System.out.println("Promoted");
        }
        else {
            System.out.println("Failed");
        }

    }
}
