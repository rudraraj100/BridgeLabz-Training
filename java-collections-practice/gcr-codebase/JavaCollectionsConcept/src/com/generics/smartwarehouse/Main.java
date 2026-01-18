package com.generics.smartwarehouse;

public class Main {

	public static void main(String[] args) {
		
		Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 55000, 2));
        electronicsStorage.addItem(new Electronics("TV", 40000, 3));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 1200, "12-2026"));
        groceryStorage.addItem(new Groceries("Milk", 60, "02-2026"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa", 25000, "Leather"));
        furnitureStorage.addItem(new Furniture("Table", 8000, "Wood"));

        System.out.println("---- Electronics ----");
        WarehouseUtils.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n---- Groceries ----");
        WarehouseUtils.displayAllItems(groceryStorage.getItems());

        System.out.println("\n---- Furniture ----");
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}

		

	