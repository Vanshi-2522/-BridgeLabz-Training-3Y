public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;  // String initialized as null
        // This will throw NullPointerException because text is null
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;  // String initialized as null
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: NullPointerException occurred!");
        }
    }

    public static void main(String[] args) {
        // First, generate the exception
        System.out.println("---- Generating Exception ----");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Generated Exception: " + e);
        }

        // Then, demonstrate handling it properly
        System.out.println("\n---- Handling Exception ----");
        handleException();
    }
}
