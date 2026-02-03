package com.funtionalinterface.datatagging;

public class User implements SensitiveData {
    private String username;
    private String password; // sensitive

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return username + " / " + password;
    }
}

class Customer {
    private String name;
    private String email; // not sensitive

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " / " + email;
    }
}
