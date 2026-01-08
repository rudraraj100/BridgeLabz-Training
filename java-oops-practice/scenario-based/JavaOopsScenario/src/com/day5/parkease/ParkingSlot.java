package com.day5.parkease;
public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String location;
    private String vehicleTypeAllowed;

    // Constructor for slot initialization
    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Slot availability check (read-only)
    public boolean isOccupied() {
        return isOccupied;
    }

    // Internal method to assign slot
    public void assignSlot() {
        this.isOccupied = true;
        logActivity("Slot Assigned");
    }

    // Internal booking record (private)
    private void logActivity(String message) {
        System.out.println("[LOG] Slot " + slotId + ": " + message);
    }
}
