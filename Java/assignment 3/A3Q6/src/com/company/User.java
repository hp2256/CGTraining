package com.company;

public class User {
    private String id, pass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

}
