package level2;

import java.util.Scanner;

public class LargestDigitsDynamic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; // initial array size
        int[] digits = new int[maxDigit];
        int index = 0;

        int tempNumber = number; // copy of number to extract digits

        // Store digits in array dynamically
        while (tempNumber != 0) {
            // Resize array if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit += 10; // increase size by 10
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index] = tempNumber % 10; // get last digit
            tempNumber /= 10; // remove last digit
            index++;
        }

        // Find largest and second largest digits
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
        System.out.println("\nDigits of the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}

