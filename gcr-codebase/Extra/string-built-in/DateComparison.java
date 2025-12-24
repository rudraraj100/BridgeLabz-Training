/*
Problem 4: Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define date format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter first date (dd-MM-yyyy): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);

        System.out.print("Enter second date (dd-MM-yyyy): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }

        sc.close();
    }
}
