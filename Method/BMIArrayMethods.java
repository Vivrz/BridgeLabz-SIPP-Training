package Method;
import java.util.Scanner;
public class BMIArrayMethods {
    public static void calculateBMI(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][2] = arr[i][0] / ((arr[i][1] / 100.0) * (arr[i][1] / 100.0));
        }
    }
    public static String[] getStatus(double[][] arr) {
        String[] status = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double bmi = arr[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal weight";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }
        calculateBMI(arr);
        String[] status = getStatus(arr);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i][1] + " " + arr[i][0] + " " + arr[i][2] + " " + status[i]);
        }
        sc.close();
    }
}
