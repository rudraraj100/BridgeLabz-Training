package com.inheritance.assistedproblems.employeemanagementsystem;

public class Intern extends Employee{
	
	String internName;
	long stipend;
	
	public Intern(String internName , long stipend) {
		this.internName = internName;
		this.stipend = stipend;
	}
	
	@Override
	void displayDetail() {
	
		System.out.println("Name of intern:  " + internName );
		System.out.println("Stipend:         " + stipend);
	}

}
