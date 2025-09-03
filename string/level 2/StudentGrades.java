import java.util.*;

public class StudentGrades {

    // Method (a) Generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // PCM subjects

        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics (40-100)
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry
            scores[i][2] = 40 + rand.nextInt(61); // Math
        }
        return scores;
    }

    // Method (b) Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method (c) Determine grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method (d) Display scorecard
    public static void displayResults(int[][] scores, double[][] results, String[] grades) {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                              scores[i][0], scores[i][1], scores[i][2],
                              results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("---------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayResults(scores, results, grades);
    }
}
