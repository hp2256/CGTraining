package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Employee,String> empTable = new HashMap<>();
        empTable.put(new Employee(2),"HP");
        empTable.put(new Employee(3),"HPA");
        empTable.put(new Employee(4),"HPB");
        empTable.put(new Employee(5),"HPC");
        for (Employee i : empTable.keySet()){
            System.out.println(empTable.get(i));
        }



    }
}
