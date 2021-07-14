package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<DOB,String> empBday= new HashMap<>();
        DOB dob1 = new DOB(22,5,1996);
        DOB dob2 = new DOB(22,5,1986);
        DOB dob3 = new DOB(22,5,1976);
        empBday.put(dob1,"Harsh");
        empBday.put(dob2,"John");
        empBday.put(dob3,"Jose");
        empBday.put(new DOB(12,6,1997),"Candice");
        empBday.put(new DOB(11,12,1994),"Kenma");
        empBday.put(new DOB(3,11,1993),"Kony");

        Set<Map.Entry<DOB,String>> values = empBday.entrySet();
         for (Map.Entry<DOB,String> e :values){
             System.out.println(e.getKey().day+"/"+e.getKey().month+"/"+e.getKey().year+" " +e.getValue());
         }
    }
}
