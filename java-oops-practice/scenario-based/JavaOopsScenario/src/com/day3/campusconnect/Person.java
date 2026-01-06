package com.day3.campusconnect;

//Base class for common person details
public class Person {
 protected int id;
 protected String name;
 protected String email;

 // Constructor
 public Person(int id, String name, String email) {
     this.id = id;
     this.name = name;
     this.email = email;
 }

 // Polymorphic method
 public void printDetails() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
 }
}

