package level2;

import java.util.Scanner;

public class ReverseNumberArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int digitCount = 0;

        // Count number of digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Store digits in array
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10; // get last digit
            tempNumber /= 10; // remove last digit
        }

        // Create an array for reversed number
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        // Display reversed digits
        System.out.println("\nDigits of the number in reverse order:");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i] + " ");
        }

        sc.close();
    }
}
