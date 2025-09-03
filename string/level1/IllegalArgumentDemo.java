import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Setting start > end to trigger exception
        String sub = text.substring(5, 2); 
        System.out.println("Substring: " + sub);
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            // Same invalid call
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: IllegalArgumentException occurred!");
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
