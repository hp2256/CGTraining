package com.assignments.A1Q4;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
