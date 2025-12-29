/*
Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/
import java.util.Scanner;

public class PhoneRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 0;
        String choice = "";

        do {
            // Take operator
            System.out.println("Enter your mobile operator (Jio / Airtel / Vi):");
            String operator = sc.nextLine().trim().toLowerCase();

            // Take recharge amount
            System.out.println("Enter recharge amount:");
            int recharge = Integer.parseInt(sc.nextLine());
			

            // Show offers using switch
            switch (operator) {
                case "jio":
                    if (recharge >= 249) {
                        System.out.println("Jio Offer: Unlimited Night Data!");
                    } else if (recharge >= 149) {
                        System.out.println("Jio Offer: ₹20 Cashback!");
                    } else {
                        System.out.println("No offer available.");
                    }
                    break;

                case "airtel":
                    if (recharge >= 299) {
                        System.out.println("Airtel Offer: Amazon Prime (7 days)!");
                    } else if (recharge >= 199) {
                        System.out.println("Airtel Offer: Extra 1GB Data!");
                    } else {
                        System.out.println("No offer available.");
                    }
                    break;

                case "vi":
                    if (recharge >= 399) {
                        System.out.println("VI Offer: Binge All Night!");
                    } else if (recharge >= 199) {
                        System.out.println("VI Offer: 2 Days Extra Validity!");
                    } else {
                        System.out.println("No offer available.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            // Update balance
            balance += recharge;
            System.out.println("Recharge successful!");
            System.out.println("Current Balance: " + balance);

            // Ask for next action
            System.out.println("Do you want to recharge again or exit?");
            choice = sc.nextLine().trim().toLowerCase();

        } while (!choice.equals("exit"));

        System.out.println("Thank you for using Phone Recharge Simulator!");
        sc.close();
    }
}
			