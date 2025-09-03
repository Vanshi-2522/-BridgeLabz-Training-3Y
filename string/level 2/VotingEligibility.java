import java.util.*;

public class VotingEligibility {

    // Method to generate random 2-digit ages of n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 10–99 (2-digit age)
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; // invalid age
            } else if (age >= 18) {
                result[i][1] = "true";  // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }
        return result;
    }

    // Method to display result in tabular format
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote?");
        System.out.println("--------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 1: Generate ages
        int[] ages = generateAges(n);

        // Step 2: Check eligibility
        String[][] eligibility = checkEligibility(ages);

        // Step 3: Display table
        displayTable(eligibility);
    }
}
