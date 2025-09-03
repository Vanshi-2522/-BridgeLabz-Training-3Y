import java.util.*;

public class VowelConsonantIdentifier {

    // Method to check if a character is Vowel, Consonant, or Not a Letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // ASCII difference between uppercase and lowercase
        }

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to process string into 2D array of [character, type]
    public static String[][] analyzeString(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // found actual length
        }

        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Analyze string
        String[][] result = analyzeString(input);

        // Display
        displayTable(result);
    }
}
