package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n=0,count=0,x,armstrong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to see if Armstrong");
        n=sc.nextInt();
        x=n;
        while(x>0) {
            x=x/10;
            count++;
        }
        x=n;
        int lastno;
        for(int i=0;i<count;i++) {
            lastno= x%10;
            armstrong = (int) (armstrong+ Math.pow(lastno,count));
            x=x/10;
        }
        if(armstrong==n) {
            System.out.println("Number is armstrong");
        }
        else {
            System.out.println("Number is not armstrong");
        }    }
}
