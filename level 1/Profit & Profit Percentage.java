
class ProfitCalculator {
    public static void main(String[] args) {

        // Cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display output (multiline)
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
