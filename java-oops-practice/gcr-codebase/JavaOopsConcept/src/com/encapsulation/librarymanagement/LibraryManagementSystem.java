package com.encapsulation.librarymanagement;

import java.util.*;

//Main class demonstrating polymorphism
public class LibraryManagementSystem {

 public static void main(String[] args) {

     List<LibraryItem> items = new ArrayList<>();

     items.add(new Book(1, "Atomic Habits", "James Clear"));
     items.add(new Magazine(2, "National Geographic", "Editorial Team"));
     items.add(new DVD(3, "Inception", "Christopher Nolan"));

     // Polymorphic access
     for (LibraryItem item : items) {

         item.getItemDetails();
         System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

         if (item instanceof Reservable) {
             System.out.println("Available: " + ((Reservable) item).checkAvailability());
             ((Reservable) item).reserveItem();
         }

         System.out.println("--------------------------------");
     }
 }
}
