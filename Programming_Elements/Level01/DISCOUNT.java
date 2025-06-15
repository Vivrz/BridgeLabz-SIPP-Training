import java.util.*;
public class DISCOUNT {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10 % discount for you  : ");
		System.out.println("Enter the amt univeristy charging : ");
		int num = sc.nextInt();
		double discount = ((num * 10)/100.0) ;
		double act_dis = num - discount;
		System.out.println("The Discount amt is : " + discount + " And the final discount free is : " + act_dis);
		sc.close();
	}
}
