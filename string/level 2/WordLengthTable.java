import java.util.*;

public class WordLengthTable {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // throws exception when index out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop counting
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] customSplit(String str) {
        int n = findLength(str);

        // Count words (words = spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                words[wordIndex++] = sb.toString();
                sb.setLength(0); // reset StringBuilder
            }
        }
        // Add last word
        words[wordIndex] = sb.toString();

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as string
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Split words
        String[] words = customSplit(input);

        // Step 2: Get 2D array with lengths
        String[][] wordTable = getWordsWithLength(words);

        // Step 3: Display result in tabular format
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : wordTable) {
            System.out.printf("%-15s %-10d%n", row[0], Integer.parseInt(row[1]));
        }
    }
}
