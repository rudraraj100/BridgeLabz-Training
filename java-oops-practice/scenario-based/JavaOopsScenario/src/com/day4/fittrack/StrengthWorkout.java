package com.day4.fittrack;

//Strength training workout
public class StrengthWorkout extends Workout {

 public StrengthWorkout(int duration) {
     super("Strength", duration);
 }

 // Lower calorie burn compared to cardio
 @Override
 public double calculateCalories() {
     return duration * 2.0;
 }
}
