package Method;

import java.util.Scanner;
public class FactorsTasks {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        return max;
    }
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public static int product(int[] arr) {
        int p = 1;
        for (int v : arr) p *= v;
        return p;
    }
    public static int productOfCubes(int[] arr) {
        int p = 1;
        for (int v : arr) p *= Math.pow(v, 3);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.println(greatestFactor(factors));
        System.out.println(sum(factors));
        System.out.println(product(factors));
        System.out.println(productOfCubes(factors));
        sc.close();
    }
}
