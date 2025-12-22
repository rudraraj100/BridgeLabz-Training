/*
Write a program to perform matrix manipulation operations like addition, subtraction, and multiplication. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix, taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices
*/

import java.util.Random;
 
public class MatrixOperations {
         
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers 0-9
            }
        }
        return matrix;
    }
       
    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
     
    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
              
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
      
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
         
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
       
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
         
    public static void main(String[] args) {
        // Define sizes for matrices
        int rowsA = 2, colsA = 3;
        int rowsB = 3, colsB = 2;
          
        // Generate random matrices
        int[][] A = createRandomMatrix(rowsA, colsA);
        int[][] B = createRandomMatrix(rowsB, colsB);
          
        System.out.println("Matrix A:");
        displayMatrix(A);
            
        System.out.println("\nMatrix B:");
        displayMatrix(B);
            
        // For addition and subtraction, matrices must have the same size
        int[][] C = createRandomMatrix(rowsA, colsA); // Same size as A
        int[][] D = createRandomMatrix(rowsA, colsA);
         
        System.out.println("\nMatrix C:");
        displayMatrix(C);
        System.out.println("\nMatrix D:");
        displayMatrix(D);
          
        System.out.println("\nC + D:");
        displayMatrix(addMatrices(C, D));
          
        System.out.println("\nC - D:");
        displayMatrix(subtractMatrices(C, D));
           
        // Multiplication of A x B
        System.out.println("\nA x B:");
        displayMatrix(multiplyMatrices(A, B));
    }
}