import java.util.Scanner;

public class Distance  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

       
        double distanceInYards = distanceInFeet / 3;

    
        double distanceInMiles = distanceInFeet / 5280;

        
        System.out.print("\nEnter your height in feet: ");
        double heightInFeet = scanner.nextDouble();
        
       
        double heightInInches = heightInFeet * 12;
        
       
        double heightInCm = heightInInches * 2.54;

       
        System.out.printf("\nDistance Conversion:\n");
        System.out.printf("%.2f feet = %.2f yards\n", distanceInFeet, distanceInYards);
        System.out.printf("%.2f feet = %.6f miles\n", distanceInFeet, distanceInMiles);

        System.out.printf("\nHeight Conversion:\n");
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f\n", 
                         heightInCm, heightInFeet, heightInInches);

        scanner.close();
    }
}