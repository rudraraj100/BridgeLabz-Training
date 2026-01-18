package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public void displayMeal() {
        plan.showPlan();
    }

    public T getPlan() {
        return plan;
    }
}
