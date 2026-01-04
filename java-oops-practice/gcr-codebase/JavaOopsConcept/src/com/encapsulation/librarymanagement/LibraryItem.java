package com.encapsulation.librarymanagement;

//Abstract base class for all library items
public abstract class LibraryItem {

 // Encapsulated fields
 private int itemId;
 private String title;
 private String author;

 // Sensitive borrower data (secured)
 private String borrowerName;

 // Constructor
 public LibraryItem(int itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 // Concrete method to display item details
 public void getItemDetails() {
     System.out.println("ID: " + itemId);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
 }

 // Setter for borrower (controlled access)
 public void setBorrowerName(String borrowerName) {
     this.borrowerName = borrowerName;
 }

 // Abstract method for loan duration
 public abstract int getLoanDuration();
}
