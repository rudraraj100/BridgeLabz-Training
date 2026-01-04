package com.day2.cabbygo;

public class Driver {
	
	public String number;
	private double rating;
	private String licenseNumber;
    String name;
	public Driver(String number, double rating, String licenseNumber) {
	
		this.number = number;
		this.rating = rating;
		this.licenseNumber = licenseNumber;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	

	
	
}
