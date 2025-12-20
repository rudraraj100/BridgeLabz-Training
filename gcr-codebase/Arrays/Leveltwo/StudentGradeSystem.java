/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
*/

import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
         
        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
                 
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
                
        // Input marks with validation
        for (int i = 0; i < n; i++) {
             
            System.out.println("\nStudent " + (i + 1));
             
            System.out.print("Physics marks: ");
            physics[i] = sc.nextInt();
               
            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextInt();
             
            System.out.print("Maths marks: ");
            maths[i] = sc.nextInt();
              
            // Validation
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--; // decrement index to re-enter marks
            }
        }
         
        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
                 
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;
               
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            }else if (percentage[i] >= 70 && percentage[i] <=79) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60 && percentage[i] <=69) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50 && percentage[i] <= 59) {
                grade[i] = 'D';
            }else if (percentage[i] >= 40 && percentage[i] <= 49) {
                grade[i] = 'E';
            } else {
                grade[i] = 'F';
            }
        }
           
        // Display results
        System.out.println("\n----- STUDENT REPORT -----");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + physics[i] +
                " | Chemistry: " + chemistry[i] +
                " | Maths: " + maths[i] +
                " | Percentage: " + String.format("%.2f", percentage[i]) +
                " | Grade: " + grade[i]
            );
        }
        
        // close scanner stream 		
        sc.close();
    }
}  