import java.util.*;
public class Volume_Earth {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius of the earth in km is 6378 km lets calculate the volume in both the km and the miles :");
		int radius = sc.nextInt();
		double vol = ((4*3.14)/3)* (Math.pow(radius , 3)); 
		System.out.println("The volume of the eath  in km is : " +vol + " KM" );
		double miles = radius * 0.621371;
		vol = ((4*3.14)/3)* (Math.pow(miles , 3)); 
		System.out.println("The volume of the eath in miles  is : " +vol + " miles" );
		sc.close();
	}
}
