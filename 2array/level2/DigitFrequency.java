package level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // Use long to handle large numbers

        // Convert number to string to count digits
        String numStr = Long.toString(number);
        int count = numStr.length();

        // Array to store digits
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0'; // Convert char to int
        }

        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        sc.close();
    }
}

