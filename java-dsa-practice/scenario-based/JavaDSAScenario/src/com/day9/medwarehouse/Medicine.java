package com.day9.medwarehouse;

import java.time.LocalDate;

public class Medicine {
	
	private LocalDate expiryDate;
	private String name;
	
	public Medicine( String type, LocalDate expiryDate) {
		
		this.expiryDate = expiryDate;
		this.name = type;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return expiryDate+ " - "+ name;
	}
	
	

}
