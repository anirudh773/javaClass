package mohammadAamir;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveNumbercomplete {

	public static void main(String[] args) {
		int nums[]= {100,1,101,2,405,3};
		 Set<Integer> hashSet=new HashSet<>();
	        for(int num:nums){
	            hashSet.add(num);
	        }
	        int longs=0;
	        for(int num:nums){
	            if(!hashSet.contains(num-1)){
	                int currentnum=num;
	                int currentsum=1;
	                while(hashSet.contains(currentnum+1)){
	                currentnum+=1;
	                currentsum+=1;
	                }
	                longs=Math.max(longs,currentsum);
	            }
	        }
	        System.out.println(longs);

	}

}
