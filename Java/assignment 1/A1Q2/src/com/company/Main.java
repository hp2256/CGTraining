package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i=100;i<=999;i++){
            armstrong(i);
        }
    }
    public static void armstrong(int a){
        int n=0,count=0,x,armstrong=0;
           n=a;
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
            System.out.println(armstrong);
        }
       // return arm;
    }
}
