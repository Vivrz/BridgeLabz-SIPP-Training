import java.util.Scanner;
public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                while (m < 0) m = sc.nextInt();
                marks[i][j] = m;
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 80) grade[i] = "B";
            else if (percent[i] >= 70) grade[i] = "C";
            else if (percent[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percent[i] + " " + grade[i]);
        }
        sc.close();
    }
}
