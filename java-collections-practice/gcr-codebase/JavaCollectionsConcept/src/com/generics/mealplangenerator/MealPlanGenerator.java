package com.generics.mealplangenerator;

public class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
       
    	System.out.println("\nValidating Meal Plan...");
        
    	return new Meal<>(plan);
    }
}
