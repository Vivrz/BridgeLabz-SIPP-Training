import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            double salary = sc.nextDouble();
            double years = sc.nextDouble();
            while (salary <= 0 || years < 0) {
                salary = sc.nextDouble();
                years = sc.nextDouble();
            }
            data[i][0] = salary;
            data[i][1] = years;
        }
        for (int i = 0; i < 10; i++) {
            if (data[i][1] > 5) bonus[i] = data[i][0] * 0.05;
            else bonus[i] = data[i][0] * 0.02;
            newSalary[i] = data[i][0] + bonus[i];
            totalBonus += bonus[i];
            totalOld += data[i][0];
            totalNew += newSalary[i];
        }
        System.out.println(totalBonus + " " + totalOld + " " + totalNew);
        sc.close();
    }
}
