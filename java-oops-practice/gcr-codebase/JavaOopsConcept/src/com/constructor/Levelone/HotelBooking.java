package com.constructor.levelone;

public class HotelBooking {
	// attributes
	String guestName;
	String roomType;
	int night;
	
	// default constructor
	HotelBooking(){
		guestName = "Rudra";
		roomType = "AC";
		night = 2;
	}
	// parameterized constructor
	HotelBooking(String guestName , String roomType , int night){
		this.guestName = guestName;
		this.roomType = roomType;
		this.night = night;
	}
	// copy constructor
	HotelBooking(HotelBooking other){
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.night = other.night;
	}
	// display details
	void displayDetail() {
		System.out.println("Name: " + guestName);
		System.out.println("Room type: " + roomType);
		System.out.println("Night: " + night);
		System.out.println();
	}
	

}
