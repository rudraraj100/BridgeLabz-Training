package com.day4.edumentor;

//Instructor class extends User
public class Instructor extends User {
 private String specialization;

 public Instructor(String name, String email, int userId, String specialization) {
     super(name, email, userId);
     this.specialization = specialization;
 }

 @Override
 public void displayUserInfo() {
     super.displayUserInfo();
     System.out.println("Instructor Specialization: " + specialization);
 }
}

