package level3;

import java.util.Arrays;

public class NumberChecker2 {

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

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // Method to find frequency of each digit (0-9)
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // initialize frequency
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int number = 1729; // you can change this or take user input

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) { // only display digits present
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}
