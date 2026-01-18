package com.generics.smartwarehouse;

public abstract class WarehouseItem {
    String name;
    double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails();

}
