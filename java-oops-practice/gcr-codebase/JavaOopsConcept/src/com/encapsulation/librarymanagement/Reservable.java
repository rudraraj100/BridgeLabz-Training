package com.encapsulation.librarymanagement;

//Interface for items that can be reserved
public interface Reservable {

 // Reserve the library item
 void reserveItem();

 // Check availability status
 boolean checkAvailability();
}
