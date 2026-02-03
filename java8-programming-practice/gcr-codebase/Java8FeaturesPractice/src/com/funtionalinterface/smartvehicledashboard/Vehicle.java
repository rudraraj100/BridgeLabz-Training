package com.funtionalinterface.smartvehicledashboard;
interface Vehicle {

    void displaySpeed();

    // Default method for battery info
    default void displayBattery() {
        // Non-electric vehicles may ignore this
    }
}
