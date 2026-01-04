package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Teacher extends Person {
	
	String subject;
	
	public Teacher(String name , int age , String subject) {
		
		super(name , age);
		this.subject = subject;
		
	}
	
	void displayRole() {
		super.displayRole();
		System.out.println("Teaches: " + subject);
	}

}
