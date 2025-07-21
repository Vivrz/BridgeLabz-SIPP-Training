import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ages for Amar, Akbar, Anthony:");
        int amarAge = scanner.nextInt();
        int akbarAge = scanner.nextInt();
        int anthonyAge = scanner.nextInt();
        System.out.println("Enter heights for Amar, Akbar, Anthony:");
        double amarHeight = scanner.nextDouble();
        double akbarHeight = scanner.nextDouble();
        double anthonyHeight = scanner.nextDouble();
        int youngest = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        double tallest = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        System.out.println("Youngest friend's age: " + youngest);
        System.out.println("Tallest friend's height: " + tallest);
    }
}