package Control_Flow.Level01;
import java.util.*;
public class Smalles_3 {
	public static void main(String args [] ) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int first = sc.nextInt();
	int sec = sc.nextInt();
	int third = sc.nextInt();
	if(first > sec && sec > third) {
		System.out.println(third);
		return;
	}
	else if(first > sec && sec < third) {
		System.out.println(sec);
		return;
	}
	else if(first < sec && sec < third) {
		System.out.println(first);
		return;
	}
	else {
		System.out.println(third);
		return;
	}
}
}

