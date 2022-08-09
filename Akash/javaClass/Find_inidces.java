package javaClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Find_inidces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		int [] arr = new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int target = sc.nextInt();
//		System.out.println(indexes(arr,target)); 
//		
		
		int [] arr = {1,2,5,2,3};
		int target = 2;
		System.out.println(indexes(arr, target));


	}

	public static ArrayList<Integer> indexes(int[] arr , int target) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				//System.out.print(i+ " ");
				result.add(i);
			}
		}
		    return result;
				
	}
	

}
