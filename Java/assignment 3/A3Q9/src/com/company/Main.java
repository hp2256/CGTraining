package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccountList accList= new BankAccountList();

        accList.addUser(new SavingsAccount(1234,"hp",12341521, true));
        accList.addUser(new SavingsAccount(1234,"john",12351325, false));
        accList.addUser(new SavingsAccount(123451,"joe",135322, true));
        accList.addUser(new SavingsAccount(4321,"jack",25353252, false));
        accList.addUser(new SavingsAccount(1231,"jame",123555, false));


        System.out.println(accList);    }
}
