    import java.util.Scanner;

    public class BasicCalc {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take user input for two numbers
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            // Perform arithmetic operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division;

            // Handle division by zero
            if (number2 != 0) {
                division = number1 / number2;
            } else {
                System.out.println("Division by zero is undefined!");
                return; // Exit if division is invalid
            }

            // Print the results
            System.out.printf(
                "\nThe addition, subtraction, multiplication, and division of %.2f and %.2f is:\n" +
                "Addition: %.2f\n" +
                "Subtraction: %.2f\n" +
                "Multiplication: %.2f\n" +
                "Division: %.2f\n",
                number1, number2, addition, subtraction, multiplication, division
            );

            scanner.close(); // Close the scanner to prevent resource leaks
        }
    } 
