package Control_Flow.Level01;
import java.util.*;
public class POS_NEG_ZERO {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	String res = (num > 0) ? "Positive" : (num == 0) ? "NEgative " : "Zero";
	System.out.println(res);
	sc.close();
}
}

