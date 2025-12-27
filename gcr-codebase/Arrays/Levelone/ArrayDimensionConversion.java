/*
Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. 
For this create a 1D array of size rows*columns 
as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. 
Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, 
you will need Nested for loop, Outer for loop for rows, 
and the inner for loops to access each element
*/

import java.util.Scanner;

   
public class ArrayDimensionConversion{   
   public static void main(String[] args){
		
		// create scanner class to read input 
		Scanner sc = new Scanner(System.in);
		
		// Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
		
			// input for 2d array
			System.out.println("Enter elements of 2D array:");
			for( int i = 0; i < rows ; i++ ){			
				for( int j = 0 ; j < cols ; j++){
					matrix[i][j] = sc.nextInt();
				}	
			}	

			// create 1d array
			System.out.println("Enter elements of 1D array:");
			int[] arr1D = new int[rows*cols];
			int index = 0;
			
			    // copying elements of 2d array
			
				for( int i = 0; i < rows ; i++ ){			
				    for( int j = 0 ; j < cols ; j++){
						arr1D[index++] = matrix[i][j];
						
					}	
					
				}	
				
					// display 2d array
					System.out.println("\n2d array matrix: ");
					for( int i = 0; i < rows ; i++ ){			
				        for( int j = 0 ; j < cols ; j++){
							System.out.print(matrix[i][j] + " ");
						}
						System.out.println( );
				    }

					// display 1d array	
					System.out.println("\n1d array arr1D: ");
					for( int i = 0; i < arr1D.length ; i++ ){			
				       	System.out.print(arr1D[i] + " ");
					
					}
		//close scanner stream
		sc.close();
   }
}   