/*
Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/

import java.util.Random;
import java.util.Arrays;

public class ZaraBonus {
          
    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2]; // [salary, yearsOfService]
        Random rand = new Random();
           
        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary (10000-99999)
            int years = 1 + rand.nextInt(20);         // years of service (1-20)
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }
             
        return employeeData;
    }
        
    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] newData = new double[employeeData.length][2]; // [newSalary, bonus]
         
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = 0;
             
            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }
                
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
           
        return newData;
    }
          
    // Method to calculate totals and display results
    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
         
        System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");
            
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
                
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
             
            System.out.printf("%d\t\t%d\t\t%d\t%.2f\t\t%.2f\n", i+1, oldSalary, years, bonus, newSalary);
        }
           
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total\t\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }
         
    public static void main(String[] args) {
        int numEmployees = 10;
           
        // Generate salary and years of service
        int[][] employeeData = generateEmployeeData(numEmployees);
           
        // Calculate new salary and bonus
        double[][] newData = calculateBonus(employeeData);
           
        // Display summary
        displaySummary(employeeData, newData);
    }
}
