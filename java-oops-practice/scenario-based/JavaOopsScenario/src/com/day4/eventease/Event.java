package com.day4.eventease;
abstract class Event implements ISchedulable {

    private final int eventId;   
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    // pricing (encapsulated)
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
    }

    // Constructor with services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {

        this(eventId, eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Operator-based cost calculation
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public void showDetails() {
        System.out.println("\n📅 Event Details");
        System.out.println("Event ID   : " + eventId);
        System.out.println("Name       : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Attendees  : " + attendees);
        System.out.println("Organizer  : " + organizer.getName());
        System.out.println("Total Cost : ₹" + calculateTotalCost());
    }
}
