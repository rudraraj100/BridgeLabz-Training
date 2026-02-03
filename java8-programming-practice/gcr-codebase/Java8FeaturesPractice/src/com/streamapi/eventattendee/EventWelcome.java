package com.streamapi.eventattendee;
import java.util.*;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Rudra",
                "Ananya",
                "Mohit",
                "Sneha",
                "Karan"
        );

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
