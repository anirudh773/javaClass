class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> temp=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                temp.add(i);
            }
           
        }
        return temp;
    }
    
}
