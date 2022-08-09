class Solution {
    public int longestConsecutive(int[] nums) {
      Arrays.sort(nums);
        int count = 1;
        int max = 0;
        
        if(nums.length == 1){
            return 1;
        }
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]-1){
                count++;
            }else if(nums[i-1] != nums[i]){
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    
    }
}

//alternative method

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int count=0;
        int m=1;
        int a=0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int j=0;j<nums.length;j++){
        if(!set.contains(nums[j]-1)){
            a=nums[j];
            count=0;
            
            while(set.contains(a)){
                count++;
                a++;
                }
            }
            m=Math.max(m,count);
        }
        return m;
    }
}
