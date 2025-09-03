import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative check
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper Method: Reverse string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        if (original.length != reversed.length) return false;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        System.out.println("\nChecking Palindrome using different logics:");

        // Logic 1
        System.out.println("Iterative Method: " +
                (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

        // Logic 2
        System.out.println("Recursive Method: " +
                (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));

        // Logic 3
        System.out.println("Char Array Method: " +
                (isPalindromeCharArray(text) ? "Palindrome" : "Not Palindrome"));
    }
}
