package Method;

import java.util.Scanner;
public class NumberPropertiesMethods {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) { return a > b ? 1 : a == b ? 0 : -1; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for (int n : arr) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else if (n < 0) System.out.println("Negative");
            else System.out.println("Zero");
        }
        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("Equal");
        else if (cmp == 1) System.out.println("First Greater");
        else System.out.println("Last Greater");
        sc.close();
    }
}
