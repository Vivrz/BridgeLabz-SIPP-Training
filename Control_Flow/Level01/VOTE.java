package Control_Flow.Level01;
import java.util.*;
public class VOTE {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Age of the voter : ");
	int Age = sc.nextInt();
	String res = (Age >= 18) ? "The age of the voter is " + Age + " and he can vote" : "The age of the voter is " + Age + " and he can't vote";
	System.out.println(res);
	sc.close();
}
}

