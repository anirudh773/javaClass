package javaClass;

public class peak_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {0,1,5,2};
		System.out.println(peakindex(arr));

	}

	public static int peakindex(int[] arr) {
		// TODO Auto-generated method stub
		
		int low =0;
		int high=arr.length-1;
	//	int mid;
		while(low<high) {
			int mid =(high + low)/2;
			if(arr[mid]>=arr[mid+1]) {
				high = mid;
			}
			else {
				low=mid + 1;
			}
			
		}
		
		return low;
	}

}
