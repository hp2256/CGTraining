package com.company;

public class Main {

    public static void main(String[] args) {
        //here we get an error when we use persistence class directly since it is abstract
        //we need to make an object of either filepersistence or db
        Persistence pers;
        pers.persist();
    }
}
