/*
Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
*/

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesDemo {

    public static void main(String[] args) {

        // Formatter for readable date-time output
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // GMT (UTC)
        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("UTC"));

        // IST (Indian Standard Time)
        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // PST (Pacific Standard Time)
        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display times
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
