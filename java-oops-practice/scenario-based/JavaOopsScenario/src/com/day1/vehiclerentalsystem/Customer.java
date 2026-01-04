package com.day1.vehiclerentalsystem;

class Customer {
    private int customerId;
    private String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerDetails() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}

