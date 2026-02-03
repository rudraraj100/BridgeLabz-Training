package com.streamapi.emailmessage;
import java.util.*;

public class EmailNotification {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "user2@gmail.com",
                "user3@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    // Dummy email sender method
    private static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }
}
