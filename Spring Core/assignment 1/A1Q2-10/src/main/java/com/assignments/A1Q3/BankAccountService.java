package com.assignments.A1Q3;

public interface BankAccountService {

    public double withdraw(long accountid, double balance);

    public double getBalance(long accountid);

    public double deposit(long accountid, double newBalance);

    public boolean fundTransfer(long fromAccount, long toAccount, double amount);
}
