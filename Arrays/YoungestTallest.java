import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextDouble();
        int youngest = 0;
        double tallest = heights[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) youngest = i;
            if (heights[i] > tallest) tallest = heights[i];
        }
        System.out.println((youngest == 0 ? "Amar" : youngest == 1 ? "Akbar" : "Anthony") + " " + tallest);
        sc.close();
    }
}
