/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/

import java.util.Scanner;

// Class QuotientReminder represents quotient and remainder calculation
public class QuotientReminder{
   public static void main(String[] args){
     // Create Scanner object to read input
	 Scanner sc = new Scanner(System.in);
	 
	 // Accept first number and second number from user
	 System.out.println("Input the number1");
	 int a = sc.nextInt();
	 System.out.println("Input the number2");
	 int b = sc.nextInt();
	 
	 // Calculate quotient using division operator
	 int quotient = a / b;
	 
	 // Calculate remainder using modulus operato
	 int reminder = a % b;
	 
	 
	 // Display quotient and remainder
	 System.out.println("The Quotient is " + quotient+ " and Reminder is " + reminder + " of two number " + a + " and " + b);
	}
}	