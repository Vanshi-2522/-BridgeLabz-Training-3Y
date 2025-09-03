import java.util.*;

public class CustomTrim {

    // Method to find start and end index without leading/trailing spaces
    public static int[] findTrimIndexes(String str) {
        int n = 0;
        try {
            while (true) {
                str.charAt(n);
                n++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // length found
        }

        int start = 0, end = n - 1;

        // Trim leading spaces
        while (start < n && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(input);

        // Custom trimmed string
        String customTrimmed = customSubstring(input, indexes[0], indexes[1]);

        // Built-in trimmed string
        String builtinTrimmed = input.trim();

        // Compare results
        boolean areEqual = compareStrings(customTrimmed, builtinTrimmed);

        // Display results
        System.out.println("\nOriginal String: \"" + input + "\"");
        System.out.println("Custom Trimmed: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtinTrimmed + "\"");
        System.out.println("Comparison Result: " + (areEqual ? "Same" : "Different"));
    }
}
