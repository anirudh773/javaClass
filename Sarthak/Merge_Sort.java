package Sorting;

import java.util.Scanner;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		divide(arr,0,n-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void divide(int [] arr,int f,int l) {
		if(f>=l) {
			return;
		}
//		int mid=(f+l)/2;  This condition sometime takes time for larger value.So,
		int mid=f+(l-f)/2;

		divide(arr,f,mid);
		divide(arr,mid+1,l);
		conquer(arr,f,mid,l);
	}
	
	public static void conquer(int [] arr, int f,int mid,int l) {
		int [] merge=new int[l-f+1];   //l-f+1:- This is used to calculate the overall length
		int id1=f;
		int id2=mid+1;
		int x=0;  //refers to merage array
		while(id1<=mid && id2<=l) {
			if(arr[id1]<=arr[id2]) {
				merge[x++]=arr[id1++];
			}
			else {
				merge[x++]=arr[id2++];
			}
		}
		while(id1<=mid) {
			merge[x++]=arr[id1++];
		}
		while(id2<=l) {
			merge[x++]=arr[id2++];
		}
		
	   for(int i=0, j=f; i<merge.length ;i++,j++) {
		   arr[j]=merge[i];
		}
	}

}
