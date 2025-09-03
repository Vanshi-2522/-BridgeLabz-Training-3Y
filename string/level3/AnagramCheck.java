import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: If lengths differ → Not anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for 256 ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Count frequencies for text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Step 4: Count frequencies for text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Step 5: Compare both frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Check Anagram
        if (areAnagrams(text1, text2)) {
            System.out.println("Result: The texts are Anagrams ✅");
        } else {
            System.out.println("Result: The texts are NOT Anagrams ❌");
        }
    }
}
