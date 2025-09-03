package level3;

import java.util.Scanner;

public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int n = number;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy: " + isSpy(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzz(number));

        sc.close();
    }
}

