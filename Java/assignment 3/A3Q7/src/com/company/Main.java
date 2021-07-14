package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        ArrayList<Parked_CarOwner_Details> parkedCarList = new ArrayList<>();
        Parked_CarOwner_Details p1= new Parked_CarOwner_Details("harsh","city","Mumbai",1234,12345689);
        Parked_CarOwner_Details p2=new Parked_CarOwner_Details("john","civic","churchgate",4321,98765431);
                Parked_CarOwner_Details p3=new Parked_CarOwner_Details("joe","urus","colaba",3456,124325346);
                Parked_CarOwner_Details p4=new Parked_CarOwner_Details("kenma","tesla","marine",4574,657454341);
                Parked_CarOwner_Details p5=new Parked_CarOwner_Details("candice","458 italia","parle",8678,234263234);
        parkedCarList.add(p1);
        parkedCarList.add(p2);
        parkedCarList.add(p3);
        parkedCarList.add(p4);
        parkedCarList.add(p5);
        Parked_CarOwnerList p0= new Parked_CarOwnerList();

        boolean gettingCar = true;
        do {
            System.out.println("Enter op 1. enter car, 2. get car location");
            int opt;
            opt=sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Enter owner details");
                    String ownerName,carModel,ownerAddress;
                     int carNo;long ownerMobileNo;
                    System.out.println("Enter name");
                    ownerName=sc.nextLine();
                    System.out.println("Enter carmodel");
                    carModel=sc.nextLine();
                    System.out.println("Enter address");
                    ownerAddress=sc.nextLine();
                    System.out.println("Enter car number");
                    carNo=sc.nextInt();
                    System.out.println("Enter mobile no.");
                    ownerMobileNo=sc.nextLong();
                    System.out.println("token: "+p0.add_new_car(new Parked_CarOwner_Details(ownerName,carModel,ownerAddress,carNo,ownerMobileNo)));
                    break;
                case 2:
                    int token;
                    System.out.println("Enter location: ");
                    token=sc.nextInt();
                    System.out.println(p0.get_parked_car_location(token));
                    break;
                default:

            }

        }while(gettingCar);
        System.out.println("Token for car owner: "+ p1.getOwnerName());
        System.out.println(p0.add_new_car(p1));
    }
}
