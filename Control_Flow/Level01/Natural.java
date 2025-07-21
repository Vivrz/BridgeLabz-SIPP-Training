package Control_Flow.Level01;
import java.util.*;
public class Natural {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num  = sc.nextInt();
	if(num <= 0) {
		System.out.println("Not a natural number");
		return;
	}
	double sum = (num * (num+1))/2;
	System.out.println("The sum is :" + sum );
	sc.close();
}
}

