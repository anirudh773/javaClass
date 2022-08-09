package javaClass;

import java.util.Arrays;

public class Longest_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {100,4,200,1,3,2};
		System.out.println(longest(arr));

	}

	public static int longest(int[] arr) {
		// TODO Auto-generated method stub
		
		if(arr.length==0) {
			return 0;
		}
		Arrays.sort(arr);
		
		int n=arr[0];
		int max=1;
		int count=1 ;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==n+1) {
				count++;
			}
			else if (arr[i]!=n) {
				count=1;
			}
			n=arr[i];
			max=Math.max(max, count);
		}
		return max;
		
		
	}

}
