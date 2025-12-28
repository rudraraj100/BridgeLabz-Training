package com.constructor.levelone;

public class Book {
	// attributes
	String title;
	String author;
	double price;
	
	// default constructor
	Book(){
		title = "Build, Dont Talk";
		author = "Raj Shamani";
		price = 250.5;
	}
	
	// parameterized constructor
	public Book(String title , String author , double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// display details
	void displayDetail(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		
	}

		

}
