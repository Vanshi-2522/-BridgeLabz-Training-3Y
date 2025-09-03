package level1;
import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        // Input ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility ---");
        // Check eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            if (age < 0) {
                System.out.println("Student " + (i + 1) + " has an invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
