package com.encapsulation.librarymanagement;

//Magazine item in library
public class Magazine extends LibraryItem implements Reservable {

 private boolean isAvailable = true;

 public Magazine(int itemId, String title, String author) {
     super(itemId, title, author);
 }

 // Loan duration for magazines
 @Override
 public int getLoanDuration() {
     return 7; // days
 }

 @Override
 public void reserveItem() {
     if (isAvailable) {
         isAvailable = false;
         System.out.println("Magazine reserved successfully");
     }
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable;
 }
}
