package com.day4.fittrack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- User Profile Input --------
        System.out.println("Welcome to FitTrack");

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your weight (kg):");
        double weight = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.println("Enter your fitness goal:");
        String goal = sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, goal);

        // -------- Workout Input --------
        System.out.println("\nHow many workouts did you do today?");
        int n = sc.nextInt();

        double totalCaloriesBurned = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nWorkout " + i);
            System.out.println("Select workout type:");
            System.out.println("1. Cardio");
            System.out.println("2. Strength");

            int choice = sc.nextInt();

            System.out.println("Enter duration (minutes):");
            int duration = sc.nextInt();

            Workout workout;

            // Polymorphism via inheritance
            if (choice == 1) {
                workout = new CardioWorkout(duration);
            } else {
                workout = new StrengthWorkout(duration);
            }

            workout.startWorkout();
            workout.stopWorkout();

            user.addWorkout(workout);
            totalCaloriesBurned += workout.getCaloriesBurned();
        }

        // -------- Output --------
        System.out.println("\n----- Daily Fitness Summary -----");
        user.showProfile();

        System.out.println("Total Calories Burned: " + totalCaloriesBurned);
        System.out.println("Daily Calorie Target: " + user.calculateDailyTarget());
        System.out.println("Remaining Calories: " +
                user.calculateProgress(totalCaloriesBurned));

        sc.close();
    }
}

