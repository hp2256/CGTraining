package com.company;

public class Manager extends Employee{
    public int getSalary(){
        int sal=10000;
        int incentive = 2000;
        return sal+incentive;
    }
}
