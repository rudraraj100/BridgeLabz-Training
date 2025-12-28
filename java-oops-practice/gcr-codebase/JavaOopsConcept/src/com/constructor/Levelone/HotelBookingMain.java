package com.constructor.levelone;

public class HotelBookingMain {
	// main method to display class hotel booking
	public static void main(String[] args) {
		HotelBooking b1 = new HotelBooking();
		b1.displayDetail();
		
		HotelBooking b2 = new HotelBooking("Rakesh" , "AC" , 3);
		b2.displayDetail();
		
		HotelBooking b3 = new HotelBooking(b1);
		b3.displayDetail();

	}

}
