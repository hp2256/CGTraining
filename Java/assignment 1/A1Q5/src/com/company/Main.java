package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Double ctc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CTC");
        ctc = sc.nextDouble();
        if (ctc <= 180000) {
            System.out.println("Nil");

        } else if (ctc >= 181001 && ctc <= 300000) {
            System.out.println("Tax Payable 10%, Amount: "+ ctc*0.1);

        } else if (ctc >= 300001 && ctc <= 500000) {
            System.out.println("Tax Payable 20%, Amount: " + ctc*0.2);

        } else if (ctc >= 500001 && ctc <= 1000000) {
            System.out.println("Tax Payable 30%, Amount: " + ctc*0.3);

        } else {
            System.out.println("Not available");


        }
    }
}
