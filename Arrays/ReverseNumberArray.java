import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0, temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
