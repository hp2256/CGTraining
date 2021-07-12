package com.company;

public class CurrentAccount extends BankAccount {
    int cashCredit;
    int getMoney(){
        int savings=30000;
        cashCredit=200000;
        return savings+cashCredit;
    }
}
