package javaClass;
import java.util.*;
public class Find_inidces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		//Arrays.sort(arr);
		int target=s.nextInt();
		Find(arr,target);
	}
	public static void Find(int [] arr, int target) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.print(i+" ");
			}
	  }
    }
}
