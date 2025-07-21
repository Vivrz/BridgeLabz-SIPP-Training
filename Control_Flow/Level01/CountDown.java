package Control_Flow.Level01;
import java.util.*;
public class CountDown {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		while(num >= 1) {
			System.out.println(num);
			num--;
		}
		sc.close();
	}
}
