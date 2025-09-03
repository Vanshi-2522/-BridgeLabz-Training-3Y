import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Trying to parse a non-numeric string
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught: NumberFormatException occurred!");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First generate the exception
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Generated Exception: " + e);
        }

        // Then handle it properly
        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        sc.close();
    }
}
