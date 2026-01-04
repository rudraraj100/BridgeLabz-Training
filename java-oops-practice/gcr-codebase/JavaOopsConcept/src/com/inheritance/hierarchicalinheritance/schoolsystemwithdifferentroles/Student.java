package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Student extends Person {
	
	int classroom;
	
	public Student(String name , int age , int classroom ) {
		super(name , age);
		this.classroom = classroom;
	}
	
	void displayRole() {
		super.displayRole();
		System.out.println("Study in " + classroom + " class.");
	}
	

}
