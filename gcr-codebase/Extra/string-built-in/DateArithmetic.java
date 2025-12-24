/*
Problem 2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define date format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        // Convert string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display results
        System.out.println("Original Date : " + date.format(formatter));
        System.out.println("After additions: " + updatedDate.format(formatter));
        System.out.println("Final Date     : " + finalDate.format(formatter));

        sc.close();
    }
}
