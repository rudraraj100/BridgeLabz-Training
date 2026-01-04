package com.day2.cabbygo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("DL01AB1234"); // polymorphism
        Driver driver = new Driver("LIC9988" ,4.7 ,"Rohit");

        IRideService ride = new RideService(vehicle, driver);
        ride.bookRide(12); // distance in km
        ride.endRide();
    }
}

