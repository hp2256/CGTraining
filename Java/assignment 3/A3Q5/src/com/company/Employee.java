package com.company;

import java.util.Objects;

public class Employee {
    int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
     return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
