package com.day2.traincompanion;
public class TrainCompanion {

    private Compartment head;
    private Compartment tail;
    private Compartment current; // passenger position

    // Insert compartment at end
    public void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = tail = current = newCompartment;
        } else {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
    }

    // Move forward
    public void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No next compartment");
        }
    }

    // Move backward
    public void movePrevious() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No previous compartment");
        }
    }

    // Remove compartment by name
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                if (current == temp)
                    current = temp.next != null ? temp.next : temp.prev;

                System.out.println("Removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    // Show adjacent compartments
    public void showAdjacentCompartments() {
        System.out.println("Previous: " +
                (current.prev != null ? current.prev.name : "None"));
        System.out.println("Current: " + current.name);
        System.out.println("Next: " +
                (current.next != null ? current.next.name : "None"));
    }
}
