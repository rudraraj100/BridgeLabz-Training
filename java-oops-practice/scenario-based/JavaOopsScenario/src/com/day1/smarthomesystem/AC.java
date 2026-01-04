package com.day1.smarthomesystem;

class AC extends Appliance {

    public AC(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC cooling room to 22°C ");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF");
    }
}
