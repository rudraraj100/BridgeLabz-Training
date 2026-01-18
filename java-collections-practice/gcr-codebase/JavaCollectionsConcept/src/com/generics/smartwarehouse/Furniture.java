package com.generics.smartwarehouse;

public class Furniture extends WarehouseItem {

	String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    public void displayDetails() {
        System.out.println("Furniture: " + name + ", Price: " + price + ", Material: " + material);
    }
}