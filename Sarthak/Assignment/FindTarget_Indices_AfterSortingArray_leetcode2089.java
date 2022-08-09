package Sarthak.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTarget_Indices_AfterSortingArray_leetcode2089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int target=s.nextInt();
		Find(arr,target);
	}
	public static void Find(int [] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.print(i+" ");
			}
		}
	}
	
	// Alternate Method: using ArrayList
	
	
//	 public List<Integer> targetIndices(int[] arr, int target) {
//	        Arrays.sort(arr);
//	        List<Integer> result=new ArrayList<Integer>();
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]==target) {
//					result.add(i);
//				}
//			}
//	        return result;
//	    }
	

}
