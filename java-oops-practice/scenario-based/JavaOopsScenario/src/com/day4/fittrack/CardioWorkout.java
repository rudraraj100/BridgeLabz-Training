package com.day4.fittrack;

//Cardio workout like running, cycling
public class CardioWorkout extends Workout {

 public CardioWorkout(int duration) {
     super("Cardio", duration);
 }

 // Higher calorie burn
 @Override
 public double calculateCalories() {
     return duration * 3; // calories per minute
 }
}

