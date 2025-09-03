import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing invalid index (array length is names.length)
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: ArrayIndexOutOfBoundsException occurred!");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Take input from user
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // First generate the exception
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Generated Exception: " + e);
        }

        // Then handle it properly
        System.out.println("\n---- Handling Exception ----");
        handleException(names);

        sc.close();
    }
}
