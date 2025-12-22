/*
Create a program to display a calendar for a given month and year. 
The program should take the month and year as input from the user and 
display the calendar for that month. E.g. for 07 2005 user input, 
the program should display the calendar as shown below
*/

import java.util.Scanner;

public class CalendarDisplay {

    // Array for month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
        
    // Days in each month (non-leap year)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };
           
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
           
    // Method to get number of days in month considering leap year
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
               
    // Method to calculate first day of the month (0=Sunday, 1=Monday,...)
    public static int getFirstDayOfMonth(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0)/12) % 7;
        return d0;
    }
           
    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
           
        int firstDay = getFirstDayOfMonth(1, month, year);
        int totalDays = getDaysInMonth(month, year);
            
        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
            
        // Print days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
         
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
            
        System.out.print("Enter year: ");
        int year = sc.nextInt();
            
        displayCalendar(month, year);
        // close scanner    
        sc.close();
    }
}