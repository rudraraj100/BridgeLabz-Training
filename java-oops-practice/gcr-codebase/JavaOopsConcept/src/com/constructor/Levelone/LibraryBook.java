package com.constructor.levelone;

public class LibraryBook {
	// attributes
	String title;
	String author;
	double price;
	boolean availabilty;
	
	// parameterized constructor
	LibraryBook(String title , String author , double price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availabilty = true;	
	}
	// method to borrow book
	void borrowBook() {
		if(availabilty) {
			availabilty = false;
			System.out.println("Congrasulation, you have borrowed " + title + " written by " + author);
		}else {
			System.out.println("Sorry, " + title + ", This book is not available.");
		}
		
	}

}
