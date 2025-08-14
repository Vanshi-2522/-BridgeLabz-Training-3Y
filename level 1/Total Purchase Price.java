// Program Name: PurchasePriceCalculator.java
// Purpose: To calculate total purchase price based on unit price and quantity

import java.util.Scanner;

class PurchasePriceCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get unit price and quantity
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
