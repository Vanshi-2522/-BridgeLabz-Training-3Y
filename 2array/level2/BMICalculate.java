package level2;
import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // 0: height, 1: weight, 2: BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double height = -1;
            double weight = -1;

            // Input positive height
            while (height <= 0) {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive! Please re-enter.");
                }
            }

            // Input positive weight
            while (weight <= 0) {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive! Please re-enter.");
                }
            }

            // Store height and weight
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display all data
        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                              i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}