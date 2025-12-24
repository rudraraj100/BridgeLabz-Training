/*
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. 
Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/

import java.util.*;

public class SplitWords{

		public static int findLength(String text){
		
		int count = 0; 
        try {
            // Infinite loop
            while (true) {
                text.charAt(count); // will throw exception at invalid index
                count++;
				
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when index exceeds string length
            return count;
        }
    }
	public static int[] getSpaceIndex(String text, int length){

		int spaceCount = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ' ') {
        				spaceCount++;
    				}
			}

		int[] spaceIndex = new int[spaceCount];
		int index = 0;
			for(int i=0; i<length; i++){
				if(text.charAt(i) == ' '){
					spaceIndex[index++] = i;
					
				}
			}

		return spaceIndex;

	}
	public static String[] getWords(int[] spaceIndex, String text, int length) {

		int noOfWords = spaceIndex.length + 1;
		String[] words = new String[noOfWords];
		int indexSpace = 0;
		int indexWords = 0;
		String temp = "";

			for (int i = 0; i < length; i++) {
				if (indexSpace < spaceIndex.length && i == spaceIndex[indexSpace]) {
					words[indexWords++] = temp;
					temp = "";
					indexSpace++;
        			} else {
				temp += text.charAt(i);
        			}
    			}

    			// store last word
    			words[indexWords] = temp;

    			return words;
	}
	// Method for checking arrays equal or not
	public static boolean isArraysEqual(String[] manualWords, String[] methodWords){

		if (manualWords.length != methodWords.length) {
        		return false;
		}

		for (int i = 0; i < manualWords.length; i++) {
        		if (!manualWords[i].equals(methodWords[i])) {
				return false;
			}
		}

		return true;
	}
	
	public static void main(String[] args){

		// Taking input
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the string: ");
		String textOriginal = sc.nextLine();
	
	
		// Printing words in text using split and manual
		String text = textOriginal.trim();
		int length = findLength(text); 
		int[] spacesIndex = getSpaceIndex(text, length);
		String[] manualWords = getWords(spacesIndex, text, length);
		String[] methodWords = text.split("\\s+");
	
		if(isArraysEqual(manualWords, methodWords)){
				System.out.println("Yes, both words set is equal using manual and method. ");
				System.out.println();
				System.out.println("Words using manual Method:");
						for(int i=0; i<manualWords.length; i++){
							System.out.println(manualWords[i]);
						}
				System.out.println("Words using split Method:");
					for(int i=0; i<methodWords.length; i++){
						System.out.println(methodWords[i]);
					}

		}
		else{
			System.out.println("No both words set is not equal using manual and method ");
		}

		// close scanner
		sc.close();


	}	
}
		
	