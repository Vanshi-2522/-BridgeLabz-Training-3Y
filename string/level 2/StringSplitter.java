import java.util.*;

public class StringSplitter {

    // Method to find length of string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when index out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Stop when exception occurs
        }
        return count;
    }

    // Method to split string into words without using split()
    public static String[] customSplit(String str) {
        int n = findLength(str);

        // Step 1: Count words (words = spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        spaceIndexes[idx++] = -1; // start before first word
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = n; // end after last word

        // Step 3: Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(str.charAt(j));
            }
            words[i] = sb.toString();
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Custom split
        String[] customWords = customSplit(input);

        // Built-in split
        String[] builtInWords = input.split(" ");

        // Compare results
        boolean areEqual = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("\nCustom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nComparison Result: " + (areEqual ? "Both methods give the same result" : "Results differ"));
    }
}
