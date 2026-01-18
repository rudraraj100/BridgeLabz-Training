package com.generics.smartwarehouse;

public class Electronics extends WarehouseItem {

	int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    public void displayDetails() {
        System.out.println("Electronics: " + name + ", Price: " + price + ", Warranty: " + warrantyYears + " years");
    }
}
