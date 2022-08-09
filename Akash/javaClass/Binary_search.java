package javaClass;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int [n];
		for (int i=0; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		//int[] arr= {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		//int item=18;
		int item=s.nextInt();
		System.out.println(Binary(arr,item));
	

	}
	public static int Binary(int[] arr,int item) {
		int low=0;
		int high=arr.length-1;
		while(low <=high) {
			int mid=(low +high)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if (arr[mid]>item) {
				high=mid-1;
				
			}else {
				low =mid+1;
			}
		}
		return -1;
	}

}
