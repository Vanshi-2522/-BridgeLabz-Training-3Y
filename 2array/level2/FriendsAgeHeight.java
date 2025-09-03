package level2;

import java.util.Scanner;

public class FriendsAgeHeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }

        // Find tallest
        double maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " meters)");

        sc.close();
    }
}

