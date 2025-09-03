package level2;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate sum of n natural numbers
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n + sumRecursion(n - 1); // Recursive call
        }
    }

    // Method to calculate sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int sumByRecursion = sumRecursion(n);
            int sumByFormula = sumFormula(n);

            System.out.println("Sum of " + n + " natural numbers using recursion: " + sumByRecursion);
            System.out.println("Sum of " + n + " natural numbers using formula: " + sumByFormula);

            if (sumByRecursion == sumByFormula) {
                System.out.println("Both methods give the same result. ✅");
            } else {
                System.out.println("There is a mismatch in results. ❌");
            }
        }

        sc.close();
    }
}

