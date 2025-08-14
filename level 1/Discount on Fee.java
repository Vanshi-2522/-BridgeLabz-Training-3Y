// Program Name: FeeDiscountCalculator.java
// Purpose: To calculate discount amount and final fee after discount

class FeeDiscountCalculator {
    public static void main(String[] args) {

        // Fee and discount percentage
        double feeAmount = 125000;
        double discountPercent = 10;

        // Calculate discount amount
        double discountAmount = (discountPercent / 100) * feeAmount;

        // Calculate final discounted fee
        double finalFee = feeAmount - discountAmount;

        // Display output
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);
    }
}
