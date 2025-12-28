package com.constructor.levelone;

public class CarRentalMain {
	// main method to display class car rental
	public static void main(String[] args) {
		CarRental r1 = new CarRental();
		r1.displayDetails();
		
		CarRental r2 = new CarRental("Rudra" , "Hyundai" , 5 );
		r2.displayDetails();

	}

}
