import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceFeet, distanceYards, distanceMiles;

        System.out.print("Enter distance in feet: ");
        distanceFeet = input.nextDouble();

        distanceYards = distanceFeet / 3;
        distanceMiles = distanceYards / 1760;

        System.out.println("The distance in yards is " + distanceYards + 
                           " while the distance in miles is " + distanceMiles);
    }
}
