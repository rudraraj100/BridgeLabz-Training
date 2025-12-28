package com.constructor.levelone;

public class Person {
	// attributes
	String name;
	int age;
	String number;
	
	// default constructor
	Person(){
		name = "Rudra";
		age = 21;
		number = "7903864750";
	}
	// parameterized constructor 
	Person(String name , int age , String number){
		this.name = name;
		this.age = age;
		this.number = number;
		
	}
	// copy constructor
	Person(Person other){
		this.name = other.name;
		this.age = other.age;
		this.number = other.number;
	}
	// display details
	void displayDetail() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Number: " + number);
	}

}
