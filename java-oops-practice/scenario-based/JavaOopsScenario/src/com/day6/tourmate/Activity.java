package com.day6.tourmate;
public class Activity {
    private String name;
    private double cost;

    public Activity(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void showActivity() {
        System.out.println("Activity: " + name + " | Cost: ₹" + cost);
    }
}