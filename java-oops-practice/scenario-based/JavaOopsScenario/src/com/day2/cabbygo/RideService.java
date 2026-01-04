package com.day2.cabbygo;

class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private double fare; // sensitive
    private final double baseFare = 50;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        fare = baseFare + (distance * vehicle.getRatePerKm()); // operator usage
        System.out.println("Ride booked with " + vehicle.getType());
        System.out.println("Driver: " + driver.name);
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Thank you for riding with CabbyGo 🚕");
    }
}

	


