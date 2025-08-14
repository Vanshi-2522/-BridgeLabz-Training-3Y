// Program Name: DistanceKmToMiles.java
// Purpose: To convert a distance in km to miles

class DistanceKmToMiles {
    public static void main(String[] args) {

        // Distance in kilometers
        double distanceInKm = 10.8;

        // Conversion rate: 1 mile = 1.6 km
        double kmPerMile = 1.6;

        // Calculate miles
        double distanceInMiles = distanceInKm / kmPerMile;

        // Display output
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}
