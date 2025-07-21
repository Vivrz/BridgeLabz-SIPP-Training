package Control_Flow.Level01;
import java.util.*;
public class Diagonal {
	public static void Check(List<Integer> res , int arr [][] , List<List<Integer>> list , int g , int f){
		while(g <= f){
			res.add(arr[g][f]);
			g++;
			f--;
		}
		list.add(res);
	}
	public static void main(String args [] ) {
		int arr [][] = new int[5][5];
		for(int i = 0 ;i < arr.length ;i++) {
			for(int j = 0 ;j < arr[0].length ;j++) {
				arr[i][j] = (int )Math.random() * 100; 
			}
		}
		List<List<Integer>> list = new ArrayList<>();
		for(int i = 0 ;i < arr.length ;i++) {
			if(i == arr.length/2){
				continue;
			}
			if(i < arr.length/2){
				List<Integer> res = new ArrayList<>();
				int first = 0;
				int sec = arr.length-1;
				int g = 0;
				int f =0;
				while(first < sec){
					Check( res , arr , list , first+1 , sec-1 );
					first++;
					sec--;
				}
			}
			else {
				List<Integer> res = new ArrayList<>();
				int first = (arr.length/2)-1;
				int sec = (arr.length/2)+1;
				int g = 0;
				int f = 0;
				while(first >= 0 &&  sec < arr.length){
					Check(res , arr , list,first ,sec);
					first--;
					sec++;
				}
			}
		}
		for(List<Integer> l : list){
			for(int num : l) {
				System.out.println(num);
			}
		}
 	}
}
