package com.day1.smarthomesystem;

class Fan extends Appliance {

    public Fan(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan spinning at medium speed");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan turned OFF");
    }
}
