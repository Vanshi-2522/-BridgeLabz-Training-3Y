// Program Name: KmToMilesUserInput.java
// Purpose: To convert distance in kilometers to miles using user input

import java.util.Scanner;

class KmToMilesUserInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask user for distance in km
        System.out.print("Enter distance in kilometers: ");
        double distanceInKm = input.nextDouble();

        // Conversion factor
        double kmPerMile = 1.6;

        // Convert to miles
        double distanceInMiles = distanceInKm / kmPerMile;

        // Display result
        System.out.println("The total miles is " + distanceInMiles +
                           " mile for the given " + distanceInKm + " km");

        input.close();
    }
}
