/*
Write a program to perform matrix manipulation operations like finding the transpose, determinant, and inverse of a matrix. 
The program should take random matrices as input and display the result of the operations.
*/

import java.util.Random;
 
public class MatrixOperationsAdvanced {
       
    // Create a random matrix with given rows and columns
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // Random integer 0-9
        return matrix;
    }
       
    // Transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }
      
    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
        
    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
        
    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if(det == 0) return null;
        return new double[][] {
            { m[1][1]/det, -m[0][1]/det },
            { -m[1][0]/det, m[0][0]/det }
        };
    }
       
    // Inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if(det == 0) return null;
          
        double[][] inv = new double[3][3];
          
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;
          
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/det;
          
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;
           
        return inv;
    }
     
    // Display a matrix
    public static void displayMatrix(double[][] matrix) {
        for(double[] row : matrix) {
            for(double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
        
    public static void main(String[] args) {
        // Example 2x2 matrix
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix2x2));
        System.out.println("Determinant: " + determinant2x2(matrix2x2));
        System.out.println("Inverse:");
        double[][] inv2x2 = inverse2x2(matrix2x2);
        if(inv2x2 != null) displayMatrix(inv2x2); else System.out.println("No inverse (det=0)");
          
        System.out.println("\n------------------------\n");
          
        // Example 3x3 matrix
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3x3);
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix3x3));
        System.out.println("Determinant: " + determinant3x3(matrix3x3));
        System.out.println("Inverse:");
        double[][] inv3x3 = inverse3x3(matrix3x3);
        if(inv3x3 != null) displayMatrix(inv3x3); else System.out.println("No inverse (det=0)");
    }
}
