/*
Create a program to find the shortest, tallest, and mean height of players present in a football team.
*/

public class FootballTeamHeight {
        
    // Method to generate random heights between 150 and 250
    public static void generateHeights(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150–250
        }
    }
        
    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
           
    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
          
    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
       
    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
          
    // Main method
    public static void main(String[] args) {
           
        int[] heights = new int[11];
           
        // Generate heights
        generateHeights(heights);
          
        // Display heights
        System.out.println("Player Heights (cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
          
        System.out.println("\n\nResults:");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm%n", findMean(heights));
    }
}
