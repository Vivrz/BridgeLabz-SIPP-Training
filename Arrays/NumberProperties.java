import java.util.Scanner;
public class NumberProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (arr[0] == arr[4]) System.out.println("Equal");
        else if (arr[0] > arr[4]) System.out.println("First Greater");
        else System.out.println("Last Greater");
        sc.close();
    }
}
