/*
Create a program to save odd and even numbers into odd and 
even arrays between 1 to the number entered by the user. 
Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. 
If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/

import java.util.Scanner;

   
public class EvenOddArrays{   
   public static void main(String[] args){
		
		// create scanner class to read input and create an array of size n
		 Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Number");
            return;
        }

        int[] numbers = new int[n];

        // Store numbers in array
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        // Print even numbers
        System.out.print("The even numbers are: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Print odd numbers
        System.out.print("\nThe odd numbers are: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        //close scanner stream
		sc.close();
    }
}
	
		
		
		