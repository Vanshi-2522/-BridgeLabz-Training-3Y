package level1;
import java.util.Scanner;

public class FootballTeamMeanHeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players (in meters):");

        // Input heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; // add to sum while inputting
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display mean height
        System.out.println("\nMean height of the football team: " + mean + " meters");

        sc.close();
    }
}
