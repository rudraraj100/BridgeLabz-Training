package com.multithreading.restaurantorderingprocess;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Chefs rohan = new Chefs("Rohan" , "Pizza" , 4);
		Chefs mohan = new Chefs("Mohan" , "Pasta" , 2);
		Chefs sohan = new Chefs("Sohan" , "Salad" , 1);
		Chefs ahaan = new Chefs("Ahaan" , "Burger" , 3);
		
		rohan.start();
		mohan.start();
		sohan.start();
		ahaan.start();
		
		rohan.join();
		mohan.join();
		sohan.join();
		ahaan.join();
		
		System.out.println("_____________________________________");
		
		System.out.println("Kitchen closed - All orders completed");

	}
}
