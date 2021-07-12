package com.company;

public class FilePersistence extends Persistence{
    @Override
    void persist() {
        System.out.println("File persistence");
    }
}
