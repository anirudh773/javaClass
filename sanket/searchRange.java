class Solution {
    public int[] searchRange(int[] nums, int target) {
     int firstposition=FirstPosition(nums,target);
     int lastposition=LastPosition(nums,target);
        return new int[]{firstposition,lastposition};
    }
   public static  int FirstPosition(int[] nums, int target) {
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

    public static int LastPosition(int[] nums, int target) {
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
