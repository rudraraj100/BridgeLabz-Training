package com.funtionalinterface.smartvehicledashboard;
public class DashboardApp {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle eCar = new ElectricCar(85);

        car.displaySpeed();
        car.displayBattery(); 

        bike.displaySpeed();
        bike.displayBattery(); 

        eCar.displaySpeed();
        eCar.displayBattery(); 
    }
}
