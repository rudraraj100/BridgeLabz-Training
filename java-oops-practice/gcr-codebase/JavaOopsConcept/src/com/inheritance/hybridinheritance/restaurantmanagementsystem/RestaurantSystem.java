package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class RestaurantSystem {
    public static void main(String[] args) {

        Worker chef = new Chef("Rahul", 1);
        Worker waiter = new Waiter("Amit", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
