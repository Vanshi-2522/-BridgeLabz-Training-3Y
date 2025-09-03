package level2;

import java.util.Arrays;

public class RandomValuesStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[]{0, 0, 0};

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = sum / (double) numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
