import java.util.*;
class SandeepPushUps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[7];
        System.out.println("Enter the number of push's for each day in a week : ");
        for(int i = 0 ;i < arr.length ;i++){
            int push_UP = sc.nextInt();
            arr[i] = push_UP;
        }
        //for-each loop :->
        int total = 0;
        double avg = 0;
        for(int num : arr){
            total += num;
        }
        avg = total/arr.length;
        System.out.println("Avegrage of the sandeep push Ups : " + avg + "and the total push is : " + total);
        sc.close();
    }
}