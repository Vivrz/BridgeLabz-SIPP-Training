import java.util.*;
public class CM_FEET_INC {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height in CM : ");
		int height = sc.nextInt();
		double feet = height / 30.48;
		double inches = height / 2.54;
		System.out.println("Your height in the feet is " + feet + " feet" + " In the inches it is :" + inches + " inches");
		sc.close();
	} 
}
