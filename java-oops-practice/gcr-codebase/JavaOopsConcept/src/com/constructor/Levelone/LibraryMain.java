package com.constructor.levelone;

public class LibraryMain {
	// main method to display library
	public static void main(String[] args) {
		Ebook ebook = new Ebook(
                "978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                5.6
        );

        ebook.displayEBookDetails();

        // Modifying private member using setter
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

