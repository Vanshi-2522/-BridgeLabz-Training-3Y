package level2;

import java.util.Scanner;

public class FactorAnalysis {

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int num) {
        int count = 0;
        
        // First loop: count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        
        // Second loop: store the factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors of " + num + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));

        sc.close();
    }
}
