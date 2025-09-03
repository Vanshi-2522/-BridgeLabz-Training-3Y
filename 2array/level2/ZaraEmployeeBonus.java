package level2;

import java.util.Scanner;

public class ZaraEmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_EMPLOYEES = 10;

        double[] salary = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salaries and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--; // retry current employee
                continue;
            }

            System.out.print("Years of Service: ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--; // retry current employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + 
                               ": Old Salary = " + salary[i] + 
                               ", Bonus = " + bonus[i] + 
                               ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}

