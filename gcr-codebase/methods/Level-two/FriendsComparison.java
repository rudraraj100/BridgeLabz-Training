/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony 
based on their ages and tallest among the friends based on their heights and display it
*/

import java.util.Scanner;

public class FriendsComparison {

    // Method to find youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find tallest friend
    public static int findTallest(double[] heights) {
        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Method calls
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Output
        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
