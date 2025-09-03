package level3;

import java.util.Arrays;

public class NumberChecker {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        if (n == 0) return 1; // special case for 0
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int n = number;
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to check if a number is a duck number (has at least one non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // you can change this number or take input from user

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(number, digits));

        int[] largestDigits = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestDigits[0] + ", Second Largest Digit: " + largestDigits[1]);

        int[] smallestDigits = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestDigits[0] + ", Second Smallest Digit: " + smallestDigits[1]);
    }
}

