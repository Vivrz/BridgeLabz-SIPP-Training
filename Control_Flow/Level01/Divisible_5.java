package Control_Flow.Level01;
import java.util.*;
public class Divisible_5 {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	boolean b = true;
	if(num % 5 == 0) {
		System.out.println(b);
		return;
	}
	System.out.println(!b);
	sc.close();
}
}

