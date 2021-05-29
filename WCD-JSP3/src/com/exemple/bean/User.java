package com.exemple.bean;

public class User {
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String Mesage() {
        if (name == null) {
            return "Hello My Friend";
        } else {
            return "Hello" + name;
        }
    }
}
