package Control_Flow.Level01;
import java.util.*;
public class Prime_Not {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num <= 1) {
			System.out.println("NOt a prime ");
			return;
		}
		int c = 0;
		for(int i = 2 ;i <= Math.sqrt(num) ;i++) {
			if(num % i == 0) {
				c++;
				if(num / i != i) {
					c++;
				}
			}
		}
		if(c == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		sc.close();
	}
}