import java.util.*;
public class PRO_LOSS {
	 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the cost and the selling Price of the Goods : ");
       int cp = sc.nextInt();
       int sp = sc.nextInt();
       double profit = sp - cp;
       if(profit > 0) {
    	   double Profit_Per = (profit*100) / cp;
    	   System.out.println("Profit is : " + Profit_Per + " %");
    	   sc.close();
    	   return;
       }
       else {
    	   double Loss_Per = (profit*100)/ cp;
    	   System.out.println("loss is : " + Loss_Per * -1 + " %");
    	   sc.close();
    	   return;
       }
   }
}
