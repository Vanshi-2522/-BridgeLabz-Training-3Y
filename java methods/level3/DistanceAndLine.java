package level3;

import java.util.Scanner;

public class DistanceAndLine {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope (m) and y-intercept (b) of line
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        if (x2 == x1) { // Vertical line
            throw new IllegalArgumentException("Slope is undefined for vertical line.");
        }
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        // Calculate distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate line equation
        try {
            double[] eq = lineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line: y = " + eq[0] + "x + " + eq[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

