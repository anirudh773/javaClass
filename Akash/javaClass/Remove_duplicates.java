package javaClass;

public class Remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(Duplicates(arr));

	}

	public static int Duplicates(int[] arr) {
		// TODO Auto-generated method stub
		
		int i=1;
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]!=arr[j+1]) {
				arr[i]=arr[j+1];
				i++;
			}
		}
		return i;
	}

}
