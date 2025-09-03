package level3;

import java.util.Arrays;

public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        if (n == 0) return 1;
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

    // Method to reverse an array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number (contains at least one non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121; // You can change or take user input

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}

