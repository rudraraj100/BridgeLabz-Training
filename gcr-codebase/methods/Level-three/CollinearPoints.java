/*
Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. 
check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
*/

import java.util.Scanner;

public class CollinearPoints {
         
    // Method to check collinearity using slope formula
    public static boolean areCollinearSlope(double x1, double y1,
                                            double x2, double y2,
                                            double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
         
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
	  
	// Method to check collinearity using area of triangle formula
    public static boolean areCollinearArea(double x1, double y1,
                                           double x2, double y2,
                                           double x3, double y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }
          
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1, y1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
		System.out.println("Enter x2, y2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
           
        System.out.println("Enter x3, y3:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
          
        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);
							
        System.out.println("\nChecking collinearity using slope formula: " 
                           + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Checking collinearity using area formula: "
							+ (collinearArea ? "Collinear" : "Not Collinear"));
       // Close scanner
	   sc.close();
    }
}