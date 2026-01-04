package com.encapsulation.librarymanagement;

//Book item in library
public class Book extends LibraryItem implements Reservable {

 private boolean isAvailable = true;

 public Book(int itemId, String title, String author) {
     super(itemId, title, author);
 }

 // Loan duration for books
 @Override
 public int getLoanDuration() {
     return 14; // days
 }

 @Override
 public void reserveItem() {
     if (isAvailable) {
         isAvailable = false;
         System.out.println("Book reserved successfully");
     }
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable;
 }
}
