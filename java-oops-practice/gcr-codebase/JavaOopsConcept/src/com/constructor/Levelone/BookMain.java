package com.constructor.levelone;

public class BookMain {
	// main method to display class book
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.displayDetail();
		
		System.out.println("_____________________");
		System.out.println();
		
		Book b2 = new Book("Atomic habit" , "James Clear", 300 );
		b2.displayDetail();
		
	}

}
