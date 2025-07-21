package Control_Flow.Level01;
import java.util.*;
public class Spring {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the month and the day as month = __ and day =  __: ");
	int month = sc.nextInt();
	int day = sc.nextInt();
	boolean b = false;
	if(((month == 3 && day >= 20) || (month == 4 ) || (month == 5 ) || (month == 6 && day <= 20 ))){	
		b = true;
	}
	if(b){
		System.out.println("Spring season");
		return;
	}
	System.out.println("Not a spring season");
	sc.close();
}
}

