import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 5280 feet)
        double distanceInMiles = distanceInFeet / 5280;

        // Height conversion (additional part)
        System.out.print("\nEnter your height in feet: ");
        double heightInFeet = scanner.nextDouble();
        
        // Convert height to inches (1 foot = 12 inches)
        double heightInInches = heightInFeet * 12;
        
        // Convert height to cm (1 inch = 2.54 cm)
        double heightInCm = heightInInches * 2.54;

        // Output results
        System.out.printf("\nDistance Conversion:\n");
        System.out.printf("%.2f feet = %.2f yards\n", distanceInFeet, distanceInYards);
        System.out.printf("%.2f feet = %.6f miles\n", distanceInFeet, distanceInMiles);

        System.out.printf("\nHeight Conversion:\n");
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f\n", 
                         heightInCm, heightInFeet, heightInInches);

        scanner.close();
    }
}