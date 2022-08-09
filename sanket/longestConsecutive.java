//method 1

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0 ,count=1;
        for(int i=0;i<nums.length-1;i++){
            if( nums[i]+1==nums[i+1]){
                count++;
                
            }
            else{
                count=0;
            }
            max=Math.max(count,max);
            
            
        }
        return max;
        
        
    }
}

//method 2

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) 
            return 0;
        int count=0,t=0;
        int max=1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length;i++)
            set.add(nums[i]);
            for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i]-1)){
                    count=0;
                    t=nums[i];
                    while(set.contains(t)){
                        count++;
                        t++;
                    }
                    if(max<count) max=count;
                }
            }
        
        return max;
        
    }
}

