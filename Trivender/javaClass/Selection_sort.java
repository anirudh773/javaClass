package javaClass;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		//int[] arr = { 4, 5, 2, 7, 8 };
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int mini = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[mini];
			arr[mini] = t;

		}

	}

}
