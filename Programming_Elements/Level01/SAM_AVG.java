import java.util.*;
public class SAM_AVG {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in the Physics , Maths and the chemistry : ");
		int phy = sc.nextInt();
		int maths = sc.nextInt();
		int chem = sc.nextInt();
		double avg = (phy + maths + chem)/3;
		System.out.println("Avg marks of the SAM is : " + avg);
		sc.close();
	}
}
