package level3;

import java.util.Arrays;

public class FootballTeamHeights {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150 to 250 inclusive
        }
        return heights;
    }

    // Method to find sum of array elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean height
    public static double meanHeight(int[] arr) {
        return sumArray(arr) / (double) arr.length;
    }

    // Method to find shortest height
    public static int shortestHeight(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Method to find tallest height
    public static int tallestHeight(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.println("Heights of football players: " + Arrays.toString(heights));
        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.printf("Mean height: %.2f cm%n", meanHeight(heights));
    }
}
