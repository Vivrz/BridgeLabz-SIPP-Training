import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate side length (Perimeter = 4 * side => side = Perimeter / 4)
        double side = perimeter / 4;

        // Print the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        scanner.close();
    }
}