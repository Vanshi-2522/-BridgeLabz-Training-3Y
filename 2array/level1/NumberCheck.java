package level1;
import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number is Zero.");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\n--- First vs Last Element ---");
        if (first == last) {
            System.out.println("First element (" + first + ") is EQUAL to Last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is GREATER than Last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is LESS than Last element (" + last + ").");
        }

        sc.close();
    }
}
