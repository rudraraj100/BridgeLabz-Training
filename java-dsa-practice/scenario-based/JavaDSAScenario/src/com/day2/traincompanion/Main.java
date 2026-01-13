package com.day2.traincompanion;
public class Main {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");
        train.addCompartment("WiFi");

        train.showAdjacentCompartments();
        train.moveNext();
        train.showAdjacentCompartments();

        train.removeCompartment("Pantry");
        train.showAdjacentCompartments();

        train.moveNext();
        train.movePrevious();
    }
}
