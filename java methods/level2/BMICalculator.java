package level2;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in the 3rd column of the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // in kg
            double heightCm = data[i][1]; // in cm
            double heightM = heightCm / 100; // convert to meters
            data[i][2] = weight / (heightM * heightM); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows, 3 columns (weight, height, BMI)

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] status = determineBMIStatus(data);

        // Display results
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                              i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}

