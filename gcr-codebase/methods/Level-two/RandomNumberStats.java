/*
Write a program that generates five 4 digit random values and then finds their average value, 
and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
*/

public class RandomNumberStats {

    // Method to generate a 4-digit random number
    public static int generateFourDigitRandom() {
        return (int)(Math.random() * 9000) + 1000;
    }

    // Method to find average
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / 5.0;
    }

    // Method to find minimum
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    // Method to find maximum
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = new int[5];

        // Generate random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = generateFourDigitRandom();
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        double average = findAverage(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);

        // Display results
        System.out.println("Average value: " + average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}