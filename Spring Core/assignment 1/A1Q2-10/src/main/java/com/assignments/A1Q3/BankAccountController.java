package com.assignments.A1Q3;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountController {

    BankAccount bankAccount;
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double withdraw(long accountid, double balance) {
        if (accountid==bankAccount.getAccountId())
            return bankAccount.getAccountBalance()-balance;
        else
            return 0;
    }

    public double getBalance(long accountid) {
        if (accountid==bankAccount.getAccountId())
        return bankAccount.getAccountBalance();
        else
            return 0;
    }

    public double deposit(long accountid, double newBalance){
        if (bankAccount.getAccountId()==accountid)
        return newBalance+bankAccount.getAccountBalance();
        else return 0;
    }

    public boolean fundTransfer(long fromAccount, long toAccount, double amount){
        return true;
    }
}
