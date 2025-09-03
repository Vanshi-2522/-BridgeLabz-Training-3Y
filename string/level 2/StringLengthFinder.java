import java.util.Scanner;

public class StringLengthFinder {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) { // infinite loop
                str.charAt(count);  // will throw exception when index is out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when exception occurs, we stop counting
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // find length using custom method
        int customLength = findLength(input);

        // find length using built-in method
        int builtInLength = input.length();

        // display results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}
