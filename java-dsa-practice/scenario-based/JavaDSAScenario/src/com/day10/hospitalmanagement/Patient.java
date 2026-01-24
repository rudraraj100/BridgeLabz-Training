package com.day10.hospitalmanagement;

import java.time.LocalTime;

public class Patient {
	
	private String name;
	private LocalTime checkInTime;
	
	public Patient(String name, LocalTime checkInTime) {
		
		this.name = name;
		this.checkInTime = checkInTime;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	
	
	

}
