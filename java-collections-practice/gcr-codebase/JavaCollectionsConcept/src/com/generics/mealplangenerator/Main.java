package com.generics.mealplangenerator;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        vegMeal.displayMeal();

        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());
        veganMeal.displayMeal();

        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetoMeal());
        ketoMeal.displayMeal();

        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generateMealPlan(new HighProteinMeal());
        proteinMeal.displayMeal();
    }
}
