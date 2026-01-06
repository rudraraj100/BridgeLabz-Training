package com.day4.edumentor;

//Learner class extends User
public class Learner extends User {
 private int progress; // Progress percentage

 public Learner(String name, String email, int userId) {
     super(name, email, userId);
     this.progress = 0; // Initially 0%
 }

 public void setProgress(int progress) {
     if(progress >= 0 && progress <= 100)
         this.progress = progress;
 }

 public int getProgress() {
     return progress;
 }

 @Override
 public void displayUserInfo() {
     super.displayUserInfo();
     System.out.println("Learner Progress: " + progress + "%");
 }
}
