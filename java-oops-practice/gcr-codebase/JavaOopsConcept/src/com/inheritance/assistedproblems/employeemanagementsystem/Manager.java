package com.inheritance.assistedproblems.employeemanagementsystem;

public class Manager extends Employee {
	
	int teamSize;
	String managerName;
	
	public Manager(int teamSize , String managerName) {
		this.teamSize = teamSize;
		this.managerName = managerName;
	}
	
	@Override
	void displayDetail() {
		
		
		System.out.println("Manager name:   " + managerName);
		System.out.println("Total members:  " + teamSize);
	}
}
