import java.util.Scanner;

public class LowerCaseCompare {

    // Method to convert string to lowercase using charAt()
    public static String customToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If uppercase (A-Z), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);  // ASCII difference is 32
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

        // Custom lowercase conversion
        String customLower = customToLowerCase(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        // Compare both strings
        boolean comparison = compareStrings(customLower, builtInLower);

        // Display results
        System.out.println("\nCustom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both equal? " + comparison);

        sc.close();
    }
}
