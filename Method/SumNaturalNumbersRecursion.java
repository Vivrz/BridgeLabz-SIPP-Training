package Method;

import java.util.Scanner;
public class SumNaturalNumbersRecursion {
    public static int sumRec(int n) {
        if (n == 1) return 1;
        return n + sumRec(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rec = sumRec(n);
        int form = sumFormula(n);
        System.out.println(rec + " " + form);
        sc.close();
    }
}
