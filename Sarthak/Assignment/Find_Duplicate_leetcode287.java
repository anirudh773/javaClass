package Sarthak.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Duplicate_leetcode287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Duplicate(arr));
		duplicate(arr);
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
	
	
//	  Alternate Method
	
	public static void duplicate(int [] arr) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				System.out.println(arr[i]);
			}
		}
	}
}
