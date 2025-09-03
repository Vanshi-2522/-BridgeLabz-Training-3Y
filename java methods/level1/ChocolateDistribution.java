package level1;

import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;   // quotient
        int remainingChocolates = number % divisor;  // remainder
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of chocolates and children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Check for division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Finding chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Displaying output
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
