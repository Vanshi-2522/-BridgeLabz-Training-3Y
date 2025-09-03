package level2;

import java.util.Scanner;

public class NumberAnalysis {

    // Method to check whether a number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if num1 == num2, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even ✅");
                } else {
                    System.out.println(numbers[i] + " is positive and odd ✅");
                }
            } else {
                System.out.println(numbers[i] + " is negative ❌");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        sc.close();
    }
}
