/*
Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. 
Make sure all are static methods
*/

import java.util.Scanner;

public class NumberChecker {
      
    // Method 1: Count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
        
    // Method 2: Store digits in array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        return digits;
    }
       
    // Method 3: Check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
       
    // Method 4: Check Armstrong Number
    public static boolean isArmstrong(int original, int[] digits) {
        int power = digits.length;
        int sum = 0;
         
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == original;
    }
      
    // Method 5: Largest & Second Largest
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
         
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
          
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }
      
    // Method 6: Smallest & Second Smallest
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
         
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
          
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second Smallest digit: " + secondSmallest);
    }
        
    // MAIN METHOD
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
         
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number, digitCount);
            
        System.out.println("\nCount of digits: " + digitCount);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));
          
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
         // close scanner 
        sc.close();
    }
}
