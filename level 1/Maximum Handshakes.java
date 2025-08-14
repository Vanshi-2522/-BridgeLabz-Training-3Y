// Program Name: MaxHandshakesCalculator.java
// Purpose: To find maximum number of handshakes among students

import java.util.Scanner;

class MaxHandshakesCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula for combinations
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}
