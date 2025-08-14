// Program Name: TriangleAreaCalculator.java
// Purpose: To calculate area of a triangle in square inches and square centimeters

import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get base and height in inches
        System.out.print("Enter base in inches: ");
        double baseInInches = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        // Calculate area in square inches
        double areaInSqInches = 0.5 * baseInInches * heightInInches;

        // Convert to square cm
        double areaInSqCm = areaInSqInches * 6.4516;

        // Display results
        System.out.println("The area of triangle in square inches is " + areaInSqInches +
                           " and in square centimeters is " + areaInSqCm);

        input.close();
    }
}
