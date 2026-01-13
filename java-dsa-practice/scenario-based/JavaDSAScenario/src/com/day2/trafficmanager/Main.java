package com.day2.trafficmanager;
public class Main {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        EntryQueue waitingQueue = new EntryQueue(3);

        // Vehicles waiting
        waitingQueue.enqueue("KA01");
        waitingQueue.enqueue("KA02");
        waitingQueue.enqueue("KA03");
        waitingQueue.enqueue("KA04"); // overflow

        // Move vehicles from queue to roundabout
        while (!waitingQueue.isEmpty()) {
            roundabout.addVehicle(waitingQueue.dequeue());
        }

        roundabout.printRoundabout();

        // Vehicle exits
        roundabout.removeVehicle("KA02");
        roundabout.printRoundabout();

        // New vehicle enters
        roundabout.addVehicle("KA05");
        roundabout.printRoundabout();
    }
}
