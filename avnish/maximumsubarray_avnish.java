import java.util.*;
import java.lang.*;
import java.io.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=nums[i];
            }
            else{
                sum +=nums[i];
            }
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
        
    }
}