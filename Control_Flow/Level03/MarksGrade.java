package Control_Flow.Level03;

import java.util.Scanner;
public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        double avg = (physics + chemistry + maths) / 3.0;
        String grade, remarks;
        if (avg >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (avg >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (avg >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (avg >= 60) {
            grade = "D";
            remarks = "Satisfactory";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
