package com.inheritance.assistedproblems.employeemanagementsystem;

public class Developer extends Employee {
	
	String programmingLanguage;
	
	public Developer(String programmingLanguage){
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	void displayDetail() {
		System.out.println(" This developer uses " + programmingLanguage);
	}
	
	
}
