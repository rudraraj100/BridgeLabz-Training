package com.day4.fittrack;

//Base workout class
public abstract class Workout implements ITrackable {

 protected String type;
 protected int duration; 
 protected double caloriesBurned;

 public Workout(String type, int duration) {
     this.type = type;
     this.duration = duration;
 }

 // Polymorphic method
 public abstract double calculateCalories();

 @Override
 public void startWorkout() {
     System.out.println(type + " workout started");
 }

 @Override
 public void stopWorkout() {
     caloriesBurned = calculateCalories();
     System.out.println(type + " workout stopped");
 }

 public double getCaloriesBurned() {
     return caloriesBurned;
 }
}
