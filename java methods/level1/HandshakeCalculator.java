package level1;

import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating maximum handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Displaying output
        System.out.println("The maximum number of handshakes among " 
                           + numberOfStudents + " students is " + maxHandshakes);

        sc.close();
    }
}
