package Sarthak.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate_leetcode26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		Remove(arr);
	}
	public static void Remove(int [] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            arr[count] = arr[i];
            count++;
		}
		System.out.println(count);
	}

}
