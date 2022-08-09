package Sarthak.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_leetcode704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
//		Arrays.sort(arr);
		System.out.println(Binary(arr,target));
	}
	public static int Binary(int []arr,int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;

}}
