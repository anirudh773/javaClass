// insertion sort
class Solution {
    public int[] sortArray(int[] nums) {
      
        for(int i =1; i<nums.length;i++){
            int current=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>current){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }
            
        return nums;
 }
    
}


//bubble sort(TLE error)
class Solution {
    public int[] sortArray(int[] nums) {
      
        for(int i =0; i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
           
            
        return nums;
 }
    
}

//selection sort (TLE error)
class Solution {
    public int[] sortArray(int[] nums) {
      
        for(int i =0; i<nums.length-1;i++){
           int small=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[small]){
                    small=j;
                }
            }
            int temp=nums[small];
            nums[small]=nums[i];
            nums[i]=temp;
        }
           
            
        return nums;
 }
    
}
//merged sort
class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
    public void divide(int[] nums,int start ,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        
        conqure(nums,start,mid,end);
    }
    public void conqure(int[] nums,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int x=0;
        int[] merged= new int[end-start+1];
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
             merged[x++]=nums[i++];  
            }
            else{
                merged[x++]=nums[j++];
            }
        }
        return nums;
        
    }
   
    
    
}
