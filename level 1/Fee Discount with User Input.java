// Program Name: FeeDiscountUserInput.java
// Purpose: To calculate discounted fee using user inputs

import java.util.Scanner;

class FeeDiscountUserInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get fee and discount from user
        System.out.print("Enter student fee: ");
        double feeAmount = input.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        // Calculate discount
        double discountAmount = (discountPercent / 100) * feeAmount;

        // Calculate final fee
        double finalFee = feeAmount - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
