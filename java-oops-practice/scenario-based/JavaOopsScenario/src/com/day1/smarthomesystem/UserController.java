package com.day1.smarthomesystem;

public class UserController {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        // Polymorphism in action
        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        // Operator usage
        if (ac.getPowerUsage() > fan.getPowerUsage()) {
            System.out.println("AC consumes more energy than Fan ⚡");
        }

        fan.turnOff();
        ac.turnOff();
    }
}

