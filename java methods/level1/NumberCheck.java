package level1;

import java.util.Scanner;

public class NumberCheck {

    // Method to check number type
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // positive
        } else if (num < 0) {
            return -1;  // negative
        } else {
            return 0;   // zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking number type
        int result = checkNumber(number);

        // Displaying output
        if (result == 1) {
            System.out.println("The number " + number + " is positive.");
        } else if (result == -1) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
