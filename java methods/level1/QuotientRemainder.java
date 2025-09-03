package level1;

import java.util.Scanner;

public class QuotientRemainder {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for dividend and divisor
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Finding quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying output
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        sc.close();
    }
}
