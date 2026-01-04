package com.encapsulation.ridehailing;

//Interface for GPS tracking
public interface GPS {

 // Get current location
 String getCurrentLocation();

 // Update vehicle location
 void updateLocation(String location);
}
