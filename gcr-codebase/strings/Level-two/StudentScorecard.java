/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. 
Compute the percentage and then calculate the grade as shown in figure below
Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
*/

import java.util.Random;

public class StudentScorecard {

    // Method to generate random PCM scores (2-digit)
    static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grades
    static char[] calculateGrades(double[][] results) {

        char[] grades = new char[results.length];

        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80)
                grades[i] = 'A';
            else if (percent >= 70)
                grades[i] = 'B';
            else if (percent >= 60)
                grades[i] = 'C';
            else if (percent >= 50)
                grades[i] = 'D';
            else if (percent >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }
        return grades;
    }

    // Method to display scorecard
    static void displayScorecard(int[][] scores, double[][] results, char[] grades) {

        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "%\t\t" +
                grades[i]
            );
        }
    }
	// main mathod
    public static void main(String[] args) {

        int students = 5; // can be changed

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        char[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
