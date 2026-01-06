package com.day4.edumentor;

//Base User class
public class User {
 protected String name;
 protected String email;
 protected int userId;

 // Constructor
 public User(String name, String email, int userId) {
     this.name = name;
     this.email = email;
     this.userId = userId;
 }

 // Display user info
 public void displayUserInfo() {
     System.out.println("User ID: " + userId + ", Name: " + name + ", Email: " + email);
 }
}

