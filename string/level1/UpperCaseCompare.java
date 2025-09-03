import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert string to uppercase using charAt()
    public static String customToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If lowercase (a-z), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);  // ASCII difference is 32
            } else {
                result += ch;  // keep unchanged
            }
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Custom uppercase conversion
        String customUpper = customToUpperCase(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare both strings
        boolean comparison = compareStrings(customUpper, builtInUpper);

        // Display results
        System.out.println("\nCustom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + comparison);

        sc.close();
    }
}
