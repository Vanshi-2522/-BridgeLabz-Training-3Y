import java.util.Scanner;

public class CharFrequencyNestedLoop {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        // Initialize frequency array
        for (int i = 0; i < len; i++) {
            freq[i] = 1; // every character appears at least once
        }

        // Nested loop to count frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue; // already counted, skip

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Store results in 1D String array
        String[] result = new String[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        // Trim array to actual size
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    // Display method
    public static void display(String[] result) {
        System.out.println("Character Frequencies:");
        for (String s : result) {
            System.out.println(s);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);
        display(frequency);
    }
}
