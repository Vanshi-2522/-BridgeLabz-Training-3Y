import java.util.*;

public class ZaraBonusSimple {

    // Generate salary and years of service
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int)(Math.random() * 10);       // years of service
        }
        return data;
    }

    // Calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonus = (data[i][1] > 5) ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][1] = bonus;
            result[i][0] = data[i][0] + bonus;
        }
        return result;
    }

    // Display table of salaries, bonus, and totals
    public static void displayBonusSummary(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Old Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.println(oldSalary + "\t\t" + years + "\t" + Math.round(bonus) + "\t" + Math.round(newSalary));
        }

        System.out.println("--------------------------------------------");
        System.out.println("Total\t\t\t" + Math.round(totalBonus) + "\t" + Math.round(totalNew));
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] employees = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonus(employees);
        displayBonusSummary(employees, updatedData);
    }
}
