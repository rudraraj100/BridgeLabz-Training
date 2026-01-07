package com.day4.eventease;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to EventEase");

        // Organizer details
        System.out.print("Enter organizer name: ");
        String userName = sc.nextLine();

        System.out.print("Enter organizer email: ");
        String email = sc.nextLine();

        User organizer = new User(userName, email);

        // Event selection
        System.out.print("Select Event Type (1-Birthday | 2-Conference): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter Venue Cost: ");
        double venueCost = sc.nextDouble();

        Event event;

        if (choice == 1) {
            System.out.print("Enter Catering + Decoration Cost: ");
            double serviceCost = sc.nextDouble();

            System.out.print("Enter Discount Amount: ");
            double discount = sc.nextDouble();

            event = new BirthdayEvent(
                    1001,
                    eventName,
                    location,
                    date,
                    attendees,
                    organizer,
                    venueCost,
                    serviceCost,
                    discount
            );
        } else {
            event = new ConferenceEvent(
                    1002,
                    eventName,
                    location,
                    date,
                    attendees,
                    organizer,
                    venueCost
            );
        }

       
        event.schedule();
        event.showDetails();

        System.out.print("Do you want to reschedule? (yes/no): ");
        sc.nextLine();
        String res = sc.nextLine();

        if (res.equalsIgnoreCase("yes")) {
            System.out.print("Enter new date: ");
            String newDate = sc.nextLine();
            event.reschedule(newDate);
        }

        System.out.print("Do you want to cancel the event? (yes/no): ");
        String cancel = sc.nextLine();

        if (cancel.equalsIgnoreCase("yes")) {
            event.cancel();
        }

        sc.close();
    }
}

