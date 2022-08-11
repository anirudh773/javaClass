package Sarthak.Assignment;

import java.util.Scanner;

public class FindFirst_and_LastPositionofElement_inSortedArray_leetcode34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
//		System.out.print(Find(arr,target));
//		Find(arr,target);
        
		int firstposition=FirstPosition(arr,target);
	    int lastposition=LastPosition(arr,target);
	    System.out.print(firstposition+" ");
	    System.out.print(lastposition);
	    }
	

	
//	This method have a drawback: it return -1 extra if target is inside the array. Otherwise they run correctly
//	public static int Find(int []arr,int target) {
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				System.out.print(i+" ");
//			}
//		}
//		return -1;
//	}

	
	
//   Using Binary Search

	public static  int FirstPosition(int[] nums, int target) {  //First Index
        int start = 0;
        int end = nums.length-1;

        int ans=-1 ;
        
        while(start <= end) {
            int mid = (start + end)/2;

            if(target == nums[mid]) {
                ans = mid;
                end = mid-1;
            } else if (target < nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return ans;
    }

    public static int LastPosition(int[] nums, int target) { // Last Index
        int start = 0;
        int end = nums.length-1;

        int res=-1 ;
        while(start <= end) {
            int mid = (start + end)/2;

            if(target == nums[mid]) {
                
                res = mid;
                start = mid+1;
            } else if (target < nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return res;
    }
	
}
