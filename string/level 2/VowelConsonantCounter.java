import java.util.*;

public class VowelConsonantCounter {

    // Method to check if a character is vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // ASCII difference between uppercase and lowercase
        }

        // Check if it is a lowercase alphabet
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        int index = 0;
        try {
            while (true) {
                char ch = str.charAt(index); // access character
                String type = checkCharType(ch);

                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;

                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsConsonants(input);

        // Display result
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);
    }
}
