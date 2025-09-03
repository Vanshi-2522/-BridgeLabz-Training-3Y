package level1;

import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // convert degrees to radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculating trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying output
        System.out.printf("Sine(%.2f°) = %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, results[2]);

        sc.close();
    }
}
