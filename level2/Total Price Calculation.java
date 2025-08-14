import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unitPrice, totalPrice;
        int quantity;

        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice 
                           + " if the quantity " + quantity + 
                           " and unit price is INR " + unitPrice);
    }
}
