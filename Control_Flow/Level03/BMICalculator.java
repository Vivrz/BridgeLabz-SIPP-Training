package Control_Flow.Level03;

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal weight";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);
    }
}
