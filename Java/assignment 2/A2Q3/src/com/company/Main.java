package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount cust1savings = new SavingsAccount();
        BankAccount cust2current = new CurrentAccount();

        int totalcash;
        totalcash=cust1savings.getMoney()+ cust2current.getMoney();
        System.out.println("Total money in the bank: " + totalcash);
    }
}
