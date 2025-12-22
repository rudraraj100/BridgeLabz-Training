/*
Write a program to take user input for the age of all 10 students in a class 
and check whether the student can vote depending on his/her age is greater or equal to 18.
*/

import java.util.Scanner;

public class VotingEligibility {

    // Method to take ages of students
    public static int[] inputAges(int size) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method to check voting eligibility
    public static void checkVotingEligibility(int[] ages) {

        System.out.println("\n--- Voting Eligibility ---");
		
		// Display the result in main method
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") : Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") : Cannot Vote");
            }
        }
    }

    public static void main(String[] args) {

        int numberOfStudents = 10;

        int[] ages = inputAges(numberOfStudents);
        checkVotingEligibility(ages);
    }
}