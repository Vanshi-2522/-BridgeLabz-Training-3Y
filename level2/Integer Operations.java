import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        int result1, result2, result3, result4;

        System.out.print("Enter value of a: ");
        a = input.nextInt();

        System.out.print("Enter value of b: ");
        b = input.nextInt();

        System.out.print("Enter value of c: ");
        c = input.nextInt();

        result1 = a + b * c;
        result2 = a * b + c;
        result3 = c + a / b;
        result4 = a % b + c;

        System.out.println("The results of Int Operations are " 
                           + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
