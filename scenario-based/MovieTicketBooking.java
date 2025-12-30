/*
Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Variable to control loop (1 = continue, 0 = exit)
        int choice = 1;

        // Loop to handle multiple customers
        while (choice != 0) {

            // Cost per person for one ticket
            int costPerPerson = 0;

            // Taking movie type input
            System.out.println("\nEnter movie type (horror / action / comedy): ");
            String movieType = sc.nextLine().trim().toLowerCase();

            // Taking seat type input
            System.out.println("Enter seat type (gold / silver): ");
            String seatType = sc.nextLine().trim().toLowerCase();

            // Movie base price using switch
            switch (movieType) {

                case "horror":
                    costPerPerson = 150;
                    break;

                case "action":
                    costPerPerson = 250;
                    break;

                case "comedy":
                    costPerPerson = 200;
                    break;

                // If movie type is invalid, restart loop
                default:
                    System.out.println("Invalid movie type!");
                    continue;
            }

            // Seat price adjustment using if-else
            if (seatType.equals("gold")) {
                costPerPerson += 100;
            } else if (seatType.equals("silver")) {
                costPerPerson += 50;
            } else {
                // If seat type is invalid, restart loop
                System.out.println("Invalid seat type!");
                continue;
            }

            // Asking for snacks option
            System.out.println("Do you want snacks? (yes / no): ");
            String snacks = sc.nextLine().trim().toLowerCase();

            // Adding snack cost if selected
            if (snacks.equals("yes")) {
                costPerPerson += 100;
            }

            // Taking number of members
            System.out.println("Enter total members: ");
            int members = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            // Calculating total cost
            int totalCost = members * costPerPerson;

            // Calculating GST (5%)
            double gst = totalCost * 0.05;

            // Final bill amount
            double finalBill = totalCost + gst;

            // Displaying bill details
            System.out.println("\n-------- BILL --------");
            System.out.println("Members         : " + members);
            System.out.println("Cost per person : " + costPerPerson);
            System.out.println("Total cost      : " + totalCost);
            System.out.println("GST (5%)        : " + gst);
            System.out.println("Final bill      : " + finalBill);

            // Asking user whether to continue or exit
            System.out.println("\nContinue? Press 1 | Exit? Press 0");
            choice = sc.nextInt();
            sc.nextLine(); // Clear input buffer
        }

        // Closing scanner resource
        sc.close();
    }
}

