import java.util.*;
public class Total_Divisors {
	public static void main(String args [] ) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int n = sc.nextInt();
		int c = 0;
		for(int i = 1 ;i <= Math.sqrt(n) ;i++){
			if(n % i == 0){
				c++;
				if(n / i != i){
					c++;
				}
			}
		}
		if(c == 2) {
			System.out.println(" Prime number" + c);
		}
		else {
			System.out.println("Not a Prime number" + c);
		}
		sc.close();
	}
}
