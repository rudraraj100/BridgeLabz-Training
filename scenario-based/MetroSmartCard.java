/*
Metro Smart Card Fare Deduction 🚇
In Delhi Metro, fare varies by distance.
● Ask the user for distance.
● Calculate fare using ternary operator.
● Deduct from smart card balance.
Loop until balance is exhausted or the user quits.
*/

import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 100; // Initial smart card balance
        int choice;

        while (balance > 0) {

            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance traveled (in km): ");
            int distance = sc.nextInt();

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;

            // Check sufficient balance
            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance! Please recharge.");
                break;
            }

            // Exit choice
            System.out.print("Press 1 to continue or 0 to exit: ");
            choice = sc.nextInt();

            if (choice == 0) {
                break;
            }
        }

        System.out.println("\nMetro card session ended.");
        sc.close();
    }
}
