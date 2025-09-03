package level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculating sum
            int sum = sumOfNumbers(n);

            // Displaying output
            System.out.println("The sum of first " + n + " natural numbers is " + sum);
        }

        sc.close();
    }
}
