package com.company;

public class Labour extends Employee{

    public int getSalary(){
        int overtime = 500;
        int sal = 10000;
        return sal+overtime;
    }
}
