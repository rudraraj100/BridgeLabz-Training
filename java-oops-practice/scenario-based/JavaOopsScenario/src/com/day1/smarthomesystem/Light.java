package com.day1.smarthomesystem;

class Light extends Appliance {

    public Light() {
        super(20); // default power
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON with soft brightness 🌟");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF");
    }
}
