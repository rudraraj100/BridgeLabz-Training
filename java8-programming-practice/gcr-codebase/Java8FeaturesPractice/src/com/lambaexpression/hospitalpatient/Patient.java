package com.lambaexpression.hospitalpatient;

public class Patient {
	
	private Long id;
	private String name;
	
	public Patient(Long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void displayDetail() {
		
		System.out.println("Pateint id: " + id +", Pateint name: " + name);
	}
	
}
