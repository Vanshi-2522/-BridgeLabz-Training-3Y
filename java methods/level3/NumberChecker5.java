package level3;
import java.util.Scanner;

public class NumberChecker5 {

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check if a number is abundant
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check if a number is deficient
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is strong
    public static boolean isStrong(int number) {
        int sum = 0;
        int n = number;
        while (n != 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Perfect: " + isPerfect(number));
        System.out.println("Is Abundant: " + isAbundant(number));
        System.out.println("Is Deficient: " + isDeficient(number));
        System.out.println("Is Strong: " + isStrong(number));

        sc.close();
    }
}

