package com.assignments.A1Q3;

public class BankAccountRepositoryImpl implements BankAccountRepository{
    BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public double getBalance(long accountid) {
        if (bankAccount.getAccountId()==accountid)
            return bankAccount.getAccountBalance();
        else
            return 0;
    }

    @Override
    public double updateBalance(long accountid, double newBalance) {
        if (bankAccount.getAccountId()==accountid)
            return bankAccount.getAccountBalance()+newBalance;
        else
            return 0;    }
}
