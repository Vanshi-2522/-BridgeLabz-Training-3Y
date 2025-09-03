package level2;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();
        }

        // Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); // BMI formula

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
