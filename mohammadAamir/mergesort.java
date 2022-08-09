package mohammadAamir;

import java.util.Arrays;

public class mergesort {
     public static void main (String []args) {
    	   int nums[]= {1,5,7,3,4};
    	 nums=mergeSort(nums);
           System.out.println(nums);
       }
       
      
       
      
       
       public static int [] mergeSort(int[] nums)
       {
            int start=0;
           int end=nums.length-1;
           int mid=(end-start)/2;
           int [] left=mergeSort(Arrays.copyOfRange(nums,start,mid));
           int [] right=mergeSort(Arrays.copyOfRange(nums,mid+1,end));
           return merge(left,right);
       }
       
       private static int []merge(int[] left,int []right){
           int mix[]=new int[left.length+right.length];
           
           int i=0;
           int j=0;
           int k=0;
           while( i<left.length &&  j<right.length) {
   			if(left[i]<right[j]) {
   				mix[k]=left[i];
   				i++;
   				k++;
   			}
   			else {
   				mix[k]=right[j];
   				j++;
   				k++;
   			}
   		}
   		
   		while(i<left.length) {
   			mix[k]=left[i];
   			i++;
   			k++;
   		}
   		while(j<right.length) {
   			mix[k]=right[j];
   			j++;
   			k++;
   		}
           return mix;
     }
}
