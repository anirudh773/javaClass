package Sarthak.Assignment;

import java.util.Scanner;

public class Peak_Index_leetcode852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=s.nextInt();
	    }
	    Peak(arr);
	}
	public static void Peak(int []arr) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]>=arr[mid+1]) {
				hi=mid;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(lo);
	}

}
