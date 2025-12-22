/*
Create a program to take input marks of students in 3 subjects: physics, chemistry, and maths. 
Compute the total, average, and the percentage score 
*/

import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {
       
    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // [Physics, Chemistry, Maths]
        Random rand = new Random();
           
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics (40-100)
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry (40-100)
            scores[i][2] = 40 + rand.nextInt(61); // Maths (40-100)
        }
          
        return scores;
    }
         
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3]; // [total, average, percentage]
           
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
           
        return stats;
    }
       
    // Method to determine grade and remark based on percentage
    public static String[] getGradeRemarks(double percentage) {
        if (percentage >= 80)
            return new String[]{"A", "Level 4, above agency-normalized standards"};
        else if (percentage >= 70)
            return new String[]{"B", "Level 3, at agency-normalized standards"};
        else if (percentage >= 60)
            return new String[]{"C", "Level 2, below, but approaching agency-normalized standards"};
        else if (percentage >= 50)
            return new String[]{"D", "Level 1, well below agency-normalized standards"};
        else if (percentage >= 40)
            return new String[]{"E", "Level 1-, too below agency-normalized standards"};
        else
            return new String[]{"R", "Remedial standards"};
    }
       
    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] stats) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("--------------------------------------------------------------------------------------------");
           
        for (int i = 0; i < scores.length; i++) {
            double percentage = stats[i][2];
            String[] gradeRemark = getGradeRemarks(percentage);
             
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\t%s\t%s\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    gradeRemark[0], gradeRemark[1]);
        }
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
           
        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        displayScoreCard(scores, stats);
    }
}