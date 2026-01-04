package com.inheritance.assistedproblems.employeemanagementsystem;

public class Employee {
	
	String name;
	String id;
	long salary;
	
	void displayDetail() {
		System.out.println("Employee name:  " + name);
		System.out.println("Employee id:    " + id);
		System.out.println("Employee salary:" + salary);
	}

}
