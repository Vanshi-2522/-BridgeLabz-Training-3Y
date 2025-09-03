import java.util.*;

public class BMICalculator {

    // (b) Method to calculate BMI and status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to m
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    // (c) Method to compute BMI for all persons and return String array
    public static String[][] calculateAll(double[][] persons) {
        int n = persons.length;
        String[][] results = new String[n][4]; // weight, height, BMI, status

        for (int i = 0; i < n; i++) {
            double weight = persons[i][0];
            double height = persons[i][1];

            String[] bmiStatus = computeBMI(weight, height);
            results[i][0] = String.format("%.1f", weight);
            results[i][1] = String.format("%.1f", height);
            results[i][2] = bmiStatus[0];
            results[i][3] = bmiStatus[1];
        }
        return results;
    }

    // (d) Display method
    public static void display(String[][] data) {
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("----------------------------------------------------------");
    }

    // (e) Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // fixed team size
        double[][] persons = new double[n][2]; // weight, height

        // (a) Input weights and heights
        System.out.println("Enter weight(kg) and height(cm) for " + n + " persons:");
        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        // Process
        String[][] results = calculateAll(persons);

        // Display
        display(results);
    }
}
