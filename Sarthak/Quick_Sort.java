package Sorting;

import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int low=0;
		int high=arr.length-1;
		Quick(arr,low,high);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Quick(int [] arr,int low, int high) {
		if(low<high) {
			int pivo=partition(arr,low,high);
			Quick(arr,low,pivo-1);
			Quick(arr,pivo,high);
		}
	}
	public static int partition(int []arr,int low,int high) {
		int pivort=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivort) {
				i++;
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		i++;
		int t=arr[i];
		arr[i]=pivort;
		arr[high]=t;
		return i;
	}

}
