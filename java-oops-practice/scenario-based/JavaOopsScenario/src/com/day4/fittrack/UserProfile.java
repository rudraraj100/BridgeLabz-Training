package com.day4.fittrack;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {

    private String name;
    private int age;
    private double weight; 
    private String goal;

    private List<Workout> workoutLog; 

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.workoutLog = new ArrayList<>();
    }

    // Add workout safely
    public void addWorkout(Workout workout) {
        workoutLog.add(workout);
    }

    // Daily calorie target using operators
    public double calculateDailyTarget() {
        return weight * 10; 
    }

    // Progress calculation
    public double calculateProgress(double caloriesBurned) {
        return calculateDailyTarget() - caloriesBurned;
    }

    public void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
    }
}
