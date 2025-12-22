/*
Write a program Quadratic to find the roots of the equation ax2+ bx + c. 
Use Math functions Math.pow() and Math.sqrt()
*/

import java.util.Scanner;

public class Quadratic {

    // Method to calculate and display roots
    public static void findRoots(double a, double b, double c) {

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        // Display result in main method 
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("Roots are real and equal");
            System.out.println("Root = " + root);

        } else {
            System.out.println("Roots are imaginary (no real roots)");
        }
    }

    public static void main(String[] args) {
        // Accepting input and read through scanner class 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        findRoots(a, b, c);

        sc.close();
    }
}