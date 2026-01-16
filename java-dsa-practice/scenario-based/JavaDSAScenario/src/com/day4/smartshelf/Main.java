package com.day4.smartshelf;

public class Main {

	public static void displayBooks(Book[] books) {
		for(Book book: books) {
			System.out.println(book.title);
		}
	}
	public static void main(String[] args) {
		
		Book[] readingList = { new Book("The Almanack") ,
						     new Book("Atomic Habits"),
						     new Book("Deep Work"),
							};
		
		
		
		System.out.println("before sorting:");
		displayBooks(readingList);
		
		InsertionSort.insertionSort(readingList);
		
		System.out.println("\nAfter sorting:");
		displayBooks(readingList);

	}

}
