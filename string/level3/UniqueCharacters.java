import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index exceeds
                count++;
            }
        } catch (Exception e) {
            // stop when out of bounds
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] unique = new char[len]; // temporary storage
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if current character already exists in unique[]
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to result
            if (isUnique) {
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create final array with correct size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Display array
    public static void display(char[] arr) {
        System.out.print("Unique characters: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueChars(text);
        display(uniqueChars);
    }
}
