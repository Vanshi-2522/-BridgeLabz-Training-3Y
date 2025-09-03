import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII size

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and frequencies in 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // reset to avoid duplicates
                index++;
            }
        }

        return result;
    }

    // Method to display result in tabular format
    public static void displayFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println("    " + result[i][0] + "      |     " + result[i][1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);
        displayFrequency(frequency);
    }
}
