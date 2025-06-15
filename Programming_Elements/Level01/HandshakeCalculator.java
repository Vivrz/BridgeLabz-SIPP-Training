import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum handshakes using combination formula: n*(n-1)/2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result
        System.out.println("The maximum number of possible handshakes among " + 
                         numberOfStudents + " students is: " + maxHandshakes);

        scanner.close();
    }
}