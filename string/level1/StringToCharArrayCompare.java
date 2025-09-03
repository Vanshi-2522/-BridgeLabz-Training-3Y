import java.util.Scanner;

public class StringToCharArrayCompare {

    // User-defined method to convert String into char array
    public static char[] customToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);  // store each character
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to print char array
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Convert using custom method
        char[] customArray = customToCharArray(text);

        // Convert using built-in toCharArray()
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(customArray, builtInArray);

        // Display results
        System.out.print("Custom char array: ");
        printCharArray(customArray);

        System.out.print("Built-in char array: ");
        printCharArray(builtInArray);

        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
}
