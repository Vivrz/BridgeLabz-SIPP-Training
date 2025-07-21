import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < exponent) {
            result *= base;
            counter++;
        }
        System.out.println("Result: " + result);
    }
}