import java.util.*;
public class INPUT_DIS_FEE {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amt univeristy charging : and the discount for you  :  ");
		int num = sc.nextInt();
		int dis = sc.nextInt();
		double discount = ((num * dis)/100.0) ;
		double act_dis = num - discount;
		System.out.println("The Discount amt is : " + discount + " And the final discount free is : " + act_dis);
		sc.close();
	}
}
