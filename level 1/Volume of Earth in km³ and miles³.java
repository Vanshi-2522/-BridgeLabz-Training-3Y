// Program Name: EarthVolumeCalculator.java
// Purpose: To compute the volume of Earth in cubic kilometers and cubic miles

class EarthVolumeCalculator {
    public static void main(String[] args) {

        // Radius of earth in km
        double radiusInKm = 6378;

        // Conversion factor from km to miles
        double kmPerMile = 1.6;

        // Formula: Volume of sphere = (4/3) * π * r³
        double volumeInKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusInKm, 3);

        // Convert radius to miles
        double radiusInMiles = radiusInKm / kmPerMile;
        double volumeInMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusInMiles, 3);

        // Display output
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 +
                           " and cubic miles is " + volumeInMiles3);
    }
}
