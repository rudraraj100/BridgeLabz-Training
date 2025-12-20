/*
Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
*/

import java.util.Scanner;
 
public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
             
        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
             
        // 2D array for marks: rows = students, cols = subjects
        int[][] marks = new int[n][3]; // 0-Physics, 1-Chemistry, 2-Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];
         
        // Input marks with validation
        for (int i = 0; i < n; i++) {
              
            System.out.println("\nStudent " + (i + 1));
             
            System.out.print("Physics marks: ");
            marks[i][0] = sc.nextInt();
             
            System.out.print("Chemistry marks: ");
            marks[i][1] = sc.nextInt();
              
            System.out.print("Maths marks: ");
            marks[i][2] = sc.nextInt();
             
            // Validation
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter positive values only.");
                i--; // re-enter marks for this student
            }
        }
         
        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
             
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
             
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70 && percentage[i] <=79) {
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
                " | Physics: " + marks[i][0] +
                " | Chemistry: " + marks[i][1] +
                " | Maths: " + marks[i][2] +
                " | Percentage: " + String.format("%.2f", percentage[i]) +
                " | Grade: " + grade[i]
            );
        }
         
        //close scanner stream
		sc.close();
    }
}