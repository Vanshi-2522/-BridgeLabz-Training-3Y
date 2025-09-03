import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i); // build substring character by character
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

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Input start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Custom substring
        String customSub = createSubstring(text, start, end);

        // Built-in substring
        String builtInSub = text.substring(start, end);

        // Compare using custom method
        boolean customCompare = compareStrings(customSub, builtInSub);

        // Compare using built-in equals
        boolean builtInCompare = customSub.equals(builtInSub);

        // Display results
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Comparison using charAt(): " + customCompare);
        System.out.println("Comparison using equals(): " + builtInCompare);

        sc.close();
    }
}
