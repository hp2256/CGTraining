package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter int to be searched");
        x=sc.nextInt();
        for (int i=0;i<a.length;i++){
            if (x==a[i]){
                System.out.println("int is in array");
                break;
            }
        }

    }
}
