package com.day6.tourmate;
public class Transport {
    private String type;
    private double cost;

    public Transport(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void showTransport() {
        System.out.println("Transport: " + type + " | Cost: ₹" + cost);
    }
}