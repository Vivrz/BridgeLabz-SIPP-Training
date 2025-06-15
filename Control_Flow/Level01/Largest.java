package Control_Flow.Level01;
import java.util.*;
public class Largest {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	int arr [] = new int[num];
	for(int i = 0 ;i < arr.length ;i++) {
		int r = sc.nextInt();
		arr[i] = r;
	}
	int max = Integer.MIN_VALUE; 
		for(int n : arr) {
			if(n > max) {
					max = Math.max(max, n);
			}
		}
	System.out.println(max);
	sc.close();
	}
}


