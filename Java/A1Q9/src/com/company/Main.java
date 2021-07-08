package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Double s1mA,s1mB,s1mC,s1total;
      Double s2mA,s2mB,s2mC,s2total;
      Double s3mA,s3mB,s3mC,s3total;
      Double subj1total,subj2total,subj3total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter for Student 1 Subject A marks");
        s1mA=sc.nextDouble();
        System.out.println("Enter for Student 1 Subject B marks");
        s1mB=sc.nextDouble();
        System.out.println("Enter for Student 1 Subject C marks");
        s1mC=sc.nextDouble();


        System.out.println("Enter for Student 2 Subject A marks");
        s2mA=sc.nextDouble();
        System.out.println("Enter for Student 2 Subject B marks");
        s2mB=sc.nextDouble();
        System.out.println("Enter for Student 2 Subject C marks");
        s2mC=sc.nextDouble();


        System.out.println("Enter for Student 3 Subject A marks");
        s3mA=sc.nextDouble();
        System.out.println("Enter for Student 3 Subject B marks");
        s3mB=sc.nextDouble();
        System.out.println("Enter for Student 3 Subject C marks");
        s3mC=sc.nextDouble();

        s1total=s1mA+s1mB+s1mC;
        s2total=s2mA+s2mB+s2mC;
        s3total=s3mA+s3mB+s3mC;

        System.out.println("Student 1 Total Score: "+s1total  + "  Average: " +s1total/3);

        System.out.println("Student 2 Total Score: "+s2total  + "  Average: " +s2total/3);

        System.out.println("Student 3 Total Score: "+s3total  + "  Average: " +s3total/3);

        //respective subject total and avg

        subj1total=(s1mA+s2mA+s3mA) ;
        subj2total=s1mB+s2mB+s3mB;
        subj3total=s1mC+s2mC+s3mC;
        System.out.println("Subject A Total Score: "+ subj1total+ "  Average: " +subj1total/3);

        System.out.println("Subject B Total Score: "+ subj2total+ "  Average: " +subj2total/3);
        System.out.println("Subject C Total Score: "+ subj3total+ "  Average: " +subj3total/3);

    }
}
