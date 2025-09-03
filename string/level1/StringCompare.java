import java.util.Scanner;

public class StringCompare {
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        // If lengths differ, they can't be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Comparing using custom method
        boolean customResult = compareStrings(str1, str2);

        // Comparing using built-in equals method
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("Custom comparison result: " + customResult);
        System.out.println("Built-in equals() result: " + builtInResult);

        // Check if both methods give the same result
        if (customResult == builtInResult) {
            System.out.println("Both methods give the SAME result ✅");
        } else {
            System.out.println("Results are DIFFERENT ❌");
        }

        sc.close();
    }
}
