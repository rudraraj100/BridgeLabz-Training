package com.day5.parkease;
import java.util.Scanner;

public class ParkEaseApplication {

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Slot ID: ");
        int slotId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Vehicle Type (Car/Bike/Truck): ");
        String type = sc.nextLine();

        System.out.print("Enter Parking Duration (hours): ");
        int hours = sc.nextInt();

        ParkingSlot slot = new ParkingSlot(slotId, "Zone-A", type);

        Vehicle vehicle;

        // Polymorphism
        if (type.equalsIgnoreCase("Car")) {
            vehicle = new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
        } else {
            vehicle = new Truck();
        }

        if (!slot.isOccupied()) {
            slot.assignSlot();

            double charges = vehicle.calculateCharges(hours);

            System.out.println("\n✅ Parking Successful");
            System.out.println("Vehicle Type: " + type);
            System.out.println("Duration: " + hours + " hours");
            System.out.println("Total Charges: ₹" + charges);
        } else {
            System.out.println("❌ Slot already occupied");
        }

        sc.close();
    }
}
