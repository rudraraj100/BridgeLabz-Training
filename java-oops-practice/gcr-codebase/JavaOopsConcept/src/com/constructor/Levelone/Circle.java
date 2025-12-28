package com.constructor.levelone;

public class Circle {
	// attributes
	float radius;
	
	// default constructor
	Circle(){
		radius = 1.05f;
	}
	
	// parameterized constructor
	Circle(float radius){
		this.radius = radius;
	}
	// display detail
	void displayDetail(){
		System.out.println("radius: " + radius);
	
		
	}
}
