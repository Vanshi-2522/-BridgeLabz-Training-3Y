package level2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Invalid age
            return false;
        } else if (age >= 18) {
            // Eligible to vote
            return true;
        } else {
            // Not eligible to vote
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] studentAges = new int[10]; // Array to store ages

        // Loop to take input for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Check if the student can vote
            if (checker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote ❌");
            }
        }

        sc.close();
    }
}

