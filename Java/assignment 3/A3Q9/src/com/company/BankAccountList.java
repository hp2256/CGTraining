package com.company;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
    Set<SavingsAccount> accountList = new TreeSet<>();


    public void addUser(SavingsAccount acc) {
        this.accountList.add(acc);
    }


    @Override
    public String toString() {
        return "\nBankAccountList " + accountList;
    }
}
