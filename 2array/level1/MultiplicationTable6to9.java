package level1;
import java.util.Scanner;

public class MultiplicationTable6to9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Define array to store multiplication results (size 4 for 6,7,8,9)
        int[] multiplicationResult = new int[4];

        // Generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the results
        System.out.println("\n--- Multiplication Table of " + number + " from 6 to 9 ---");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}
