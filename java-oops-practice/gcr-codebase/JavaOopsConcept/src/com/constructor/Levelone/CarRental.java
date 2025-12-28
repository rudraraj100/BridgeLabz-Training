package com.constructor.levelone;

public class CarRental {
	// attributes
	String customerName;
	String carModel;
	int rentalDays;
	double totalCost;
	
	// cost per day
	static final double costPerDay = 1500;
	
	// default constructor
	CarRental(){
		this( "Guest" , "General" , 1);
		calculateTotalCost();
	}
	
	// parameterized constructor
	CarRental(String customerName , String carModel , int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		calculateTotalCost();
	}
	
	// method to calculate total cost
	void calculateTotalCost() {
		 totalCost = costPerDay * rentalDays; 
	}
	
	// display rental detail
	void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + totalCost);
        System.out.println();
    }
}
