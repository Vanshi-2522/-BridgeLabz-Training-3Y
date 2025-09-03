import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find length of string without length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string
        }
        return count;
    }

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            // check if character already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }

        // shrink array to actual size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        // count frequency using ASCII index
        for (int i = 0; i < findLength(text); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // get unique characters
        char[] unique = uniqueCharacters(text);

        // store result in 2D array
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    // Method to display results
    public static void display(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println("    " + result[i][0] + "      |     " + result[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);
        display(frequency);
    }
}
