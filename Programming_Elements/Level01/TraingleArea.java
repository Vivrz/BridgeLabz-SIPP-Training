import java.util.Scanner;

public class TraingleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for base and height (in inches)
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaSquareInches = 0.5 * baseInches * heightInches;

        // Convert inches to centimeters (1 inch = 2.54 cm)
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

        // Calculate area in square centimeters
        double areaSquareCm = 0.5 * baseCm * heightCm;

        // Convert height in inches to feet and inches (1 foot = 12 inches)
        int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;

        // Print results
        System.out.printf("\nHeight Conversion:\n");
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, heightFeet, remainingInches);
        
        System.out.printf("\nArea of the Triangle:\n");
        System.out.printf("Area in Square Inches: %.2f\n", areaSquareInches);
        System.out.printf("Area in Square Centimeters: %.2f\n", areaSquareCm);

        scanner.close();
    }
}