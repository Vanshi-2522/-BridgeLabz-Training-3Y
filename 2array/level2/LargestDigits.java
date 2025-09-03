package level2;

import java.util.Scanner;

public class LargestDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int temp = number; // copy of number to extract digits

        // Store digits in array
        while (temp != 0) {
            digits[index] = temp % 10; // get last digit
            temp /= 10; // remove last digit
            index++;
            if (index == maxDigit) {
                break; // limit to maxDigit digits
            }
        }

        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("\nDigits of the number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}

