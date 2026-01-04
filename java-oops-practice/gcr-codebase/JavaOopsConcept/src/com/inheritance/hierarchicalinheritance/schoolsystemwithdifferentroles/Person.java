package com.inheritance.hierarchicalinheritance.schoolsystemwithdifferentroles;

public class Person {
	
	String name;
	int age;
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayRole() {
		System.out.println("\nThis is opening School portal");
		System.out.println("Name: " + name);
		System.out.println("Age " + age);
		
	}
}
