package level1;
import java.util.Scanner;

public class FactorsArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        int maxFactor = 10;              // initial array size
        int[] factors = new int[maxFactor];
        int index = 0;                    // current index for factors array

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array is full
                if (index == maxFactor) {
                    // Double the array size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i; // store factor
            }
        }

        // Display factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
