import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = new int[10];
        int count = 0;
        int temp = number;
        while (temp != 0) {
            digits[count++] = temp % 10;
            temp /= 10;
        }
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) freq[digits[i]]++;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + " " + freq[i]);
        }
        sc.close();
    }
}
