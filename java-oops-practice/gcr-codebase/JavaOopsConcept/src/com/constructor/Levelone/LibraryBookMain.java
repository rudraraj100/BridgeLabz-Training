package com.constructor.levelone;

public class LibraryBookMain {
	// main method to display library book
	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook("The gift of imperfection" , "Brene Brown" , 1000 );
		
		b1.borrowBook();
		b1.borrowBook();

	}

}
