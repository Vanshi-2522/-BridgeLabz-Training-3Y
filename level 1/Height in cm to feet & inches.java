// Program Name: HeightConverter.java
// Purpose: To convert height from centimeters to feet and inches

import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Conversion factors
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        // Convert cm to inches
        double totalInches = heightInCm / cmPerInch;

        // Extract feet and inches
        int heightInFeet = (int) (totalInches / inchesPerFoot);
        double remainingInches = totalInches % inchesPerFoot;

        // Display result
        System.out.println("Your Height in cm is " + heightInCm +
                           " while in feet is " + heightInFeet +
                           " and inches is " + remainingInches);

        input.close();
    }
}
