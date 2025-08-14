// Program Name: DistanceFeetConverter.java
// Purpose: To convert distance in feet to yards and miles

import java.util.Scanner;

class DistanceFeetConverter {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        // Convert
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display result
        System.out.println("The distance is " + distanceInYards + " yards and " +
                           distanceInMiles + " miles");

        input.close();
    }
}
