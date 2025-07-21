import java.util.Scanner;
public class KM_MILES {
	 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the distance in the KM : ");
       int km = sc.nextInt();
       double miles = km * 0.621371;
       String str = String.format("%.3f" , miles);
       System.out.println("The distance in the Miles is : " + str + " miles");
       sc.close();
   }
}
