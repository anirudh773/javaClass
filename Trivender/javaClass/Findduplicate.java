package javaClass;
import java.util.*;

public class Findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Duplicate(arr));
		//Duplicate(arr);
	}
	public static int Duplicate(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;

}
}
