import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double result1, result2, result3, result4;

        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        result1 = a + b * c;
        result2 = a * b + c;
        result3 = c + a / b;
        result4 = a % b + c;

        System.out.println("The results of Double Operations are " 
                           + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
