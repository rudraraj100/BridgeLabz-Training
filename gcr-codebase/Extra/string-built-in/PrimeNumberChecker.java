/* Prime Number Checker:
○ Create a program that checks whether a given number is a prime number. ○
The program should use a separate function to perform the prime check and
return the result.
*/


import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int number) {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Divisor found
            }
        }

        return true; // No divisors found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call prime checking method
        boolean result = isPrime(number);

        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}
