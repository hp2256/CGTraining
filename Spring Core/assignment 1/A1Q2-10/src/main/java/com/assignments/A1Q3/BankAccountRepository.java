package com.assignments.A1Q3;

public interface BankAccountRepository {
    public double getBalance(long accountid);
    public double updateBalance(long accountid,double newBalance);
}
