// Program Name: SquareSideCalculator.java
// Purpose: To find side length of a square from its perimeter

import java.util.Scanner;

class SquareSideCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get perimeter from user
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        // Calculate side length
        double sideLength = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + sideLength +
                           " whose perimeter is " + perimeter);

        input.close();
    }
}
