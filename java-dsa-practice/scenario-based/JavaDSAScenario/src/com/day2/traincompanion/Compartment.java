package com.day2.traincompanion;
public class Compartment {
    String name;
    Compartment prev;
    Compartment next;

    // Constructor
    public Compartment(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
