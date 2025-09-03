package level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            double physics = -1, chemistry = -1, maths = -1;

            // Input positive marks for Physics
            while (physics < 0 || physics > 100) {
                System.out.print("Enter Physics marks (0-100) for student " + (i + 1) + ": ");
                physics = sc.nextDouble();
                if (physics < 0 || physics > 100) {
                    System.out.println("Marks must be between 0 and 100! Please re-enter.");
                }
            }

            // Input positive marks for Chemistry
            while (chemistry < 0 || chemistry > 100) {
                System.out.print("Enter Chemistry marks (0-100) for student " + (i + 1) + ": ");
                chemistry = sc.nextDouble();
                if (chemistry < 0 || chemistry > 100) {
                    System.out.println("Marks must be between 0 and 100! Please re-enter.");
                }
            }

            // Input positive marks for Maths
            while (maths < 0 || maths > 100) {
                System.out.print("Enter Maths marks (0-100) for student " + (i + 1) + ": ");
                maths = sc.nextDouble();
                if (maths < 0 || maths > 100) {
                    System.out.println("Marks must be between 0 and 100! Please re-enter.");
                }
            }

            // Store marks
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            // Calculate percentage
            percentage[i] = (physics + chemistry + maths) / 3.0;

            // Determine grade
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        // Display all data
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%s\n", 
                              i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}

