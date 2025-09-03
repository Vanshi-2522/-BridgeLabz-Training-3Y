package level1;

import java.util.Scanner;

public class TriangularRun {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3; // perimeter of the triangular park
        return totalDistance / perimeter; // number of rounds
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        double totalDistance = 5000; // 5 km in meters

        // Calculating number of rounds
        double rounds = calculateRounds(side1, side2, side3, totalDistance);

        // Displaying output
        System.out.println("To complete a 5 km run, the athlete must run approximately " 
                           + Math.ceil(rounds) + " rounds of the triangular park.");

        sc.close();
    }
}
