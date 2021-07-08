package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int t;
        System.out.println("Before sort");
        for (int x:a
        ) {
            System.out.print(x + " ");
        }
        for (int i=0;i<a.length;i++){
            for (int j=1;j<(a.length-1);j++){
                if (a[j-1]>a[j]){
                    t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("\nAfter sort");

        for (int x:a
             ) {
            System.out.print(x + " ");
        }
    }
}
