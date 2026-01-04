package com.day1.smarthomesystem;

abstract class Appliance implements Controllable {
    private boolean isOn;
    private int powerUsage; // watts

    // Constructor
    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    // Encapsulation
    public int getPowerUsage() {
        return powerUsage;
    }

    protected void setOn(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }
}

