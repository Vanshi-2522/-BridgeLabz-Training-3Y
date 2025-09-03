package level1;
import java.util.Scanner;

public class ArrayInputSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or negative number to stop):");

        while (true) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            // Stop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Array is full. Cannot add more numbers.");
                break;
            }

            // Store number in array
            numbers[index] = input;
            index++;
        }

        // Display all entered numbers and calculate total
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display total sum
        System.out.println("\nTotal of all numbers: " + total);

        sc.close();
    }
}
