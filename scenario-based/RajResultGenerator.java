/*
Raj’s Result Generator ‍
Raj runs a coaching center. He needs to generate results.
● Input 5 subject marks.
● Calculate average.
● Switch to assign grades.
● for-loop to iterate over subjects.
*/

import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = total / 5.0;
        int avg = (int) average / 10;

        // Grade assignment using switch
        String grade;
        switch (avg) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
            case 4:
                grade = "D";
                break;
            default:
                grade = "F";
        }

        // Output result
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
