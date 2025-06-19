package Method;

import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println(results[0] + " " + results[1] + " " + results[2]);
        sc.close();
    }
}
