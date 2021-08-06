package com.assignments.A1Q3;

public class BankAccountServiceImpl implements BankAccountService{
    BankAccount bankAccount;

    public BankAccountServiceImpl(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public double withdraw(long accountid, double balance) {
        return balance-5000;
    }

    @Override
    public double getBalance(long accountid) {
        return 10000;
    }

    @Override
    public double deposit(long accountid, double newBalance) {
        return 10000+newBalance;
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
        return false;
    }
}
