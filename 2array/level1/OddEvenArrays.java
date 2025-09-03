package level1;
import java.util.Scanner;

public class OddEvenArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            sc.close();
            return;
        }

        // Create arrays to store odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Display odd numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Display even numbers
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}
