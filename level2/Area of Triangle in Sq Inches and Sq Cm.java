import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseCm, heightCm;
        double areaSqCm, areaSqInch;
        double cmPerInch = 2.54;

        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        areaSqCm = 0.5 * baseCm * heightCm;
        areaSqInch = areaSqCm / (cmPerInch * cmPerInch);

        System.out.println("The Area of the triangle in sq inches is " + areaSqInch 
                           + " and in sq cm is " + areaSqCm);
    }
}
