package level1;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Define array to store results
        int[] table = new int[10];

        // Generate multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display multiplication table
        System.out.println("\n--- Multiplication Table of " + number + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
