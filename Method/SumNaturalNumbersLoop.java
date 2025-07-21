package Method;

import java.util.Scanner;
public class SumNaturalNumbersLoop {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNaturalNumbers(n));
        sc.close();
    }
}
