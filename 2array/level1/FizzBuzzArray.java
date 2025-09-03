package level1;
import java.util.Scanner;

public class FizzBuzzArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }

        // Create String array to save results
        String[] results = new String[n];

        // FizzBuzz logic
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        // Display results
        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        sc.close();
    }
}
