import java.util.Scanner;
public class PENS {
	 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of the pens and the students : ");
       int pens = sc.nextInt();
       int stu = sc.nextInt();
       int remaining = pens % stu;
       int equal = pens / stu ;
       System.out.println("The equally divided number of pens are : " + equal + " The ramining pens are : " + remaining);
       sc.close();
   }
}
