package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Staff extends Person {
	
	String shift;
	
	public Staff(String name , int age , String shift ) {
		
		super(name , age);
		this.shift = shift;
	}
	
	void displayRole() {
		super.displayRole();
		System.out.println("staff shift is " + shift );
	}
	

}
