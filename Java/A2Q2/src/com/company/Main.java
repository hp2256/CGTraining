package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee m1 = new Manager();
        Employee l1=new Labour();

        System.out.println("Salary of manager: "+ m1.getSalary());
        System.out.println("Salary of labour: "+ l1.getSalary());
        int total = m1.getSalary()+l1.getSalary();
        System.out.println("Total salary of all: "+total);
    }
}
