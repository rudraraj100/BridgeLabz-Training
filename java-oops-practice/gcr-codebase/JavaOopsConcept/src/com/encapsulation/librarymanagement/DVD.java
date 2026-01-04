package com.encapsulation.librarymanagement;

//DVD item in library
public class DVD extends LibraryItem implements Reservable {

 private boolean isAvailable = true;

 public DVD(int itemId, String title, String author) {
     super(itemId, title, author);
 }

 // Loan duration for DVDs
 @Override
 public int getLoanDuration() {
     return 3; // days
 }

 @Override
 public void reserveItem() {
     if (isAvailable) {
         isAvailable = false;
         System.out.println("DVD reserved successfully");
     }
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable;
 }
}
