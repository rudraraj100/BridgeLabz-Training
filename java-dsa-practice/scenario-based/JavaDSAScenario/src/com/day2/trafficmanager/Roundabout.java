package com.day2.trafficmanager;
public class Roundabout {

    private Vehicle head = null;
    private Vehicle tail = null;

    // Add vehicle to circular path
    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = tail = newVehicle;
            tail.next = head; // circular link
        } else {
            tail.next = newVehicle;
            tail = newVehicle;
            tail.next = head;
        }
    }

    // Remove vehicle by number
    public void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = tail;

        do {
            if (curr.number.equals(number)) {

                if (curr == head) head = head.next;
                if (curr == tail) tail = prev;

                prev.next = curr.next;
                tail.next = head;

                System.out.println("Vehicle exited: " + number);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
